package irita.sdk.crypto;

import org.bouncycastle.util.StringList;
import org.bouncycastle.util.Strings;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class ArmoredInputStream extends InputStream {
    private static final byte[] decodingTable = new byte[128];
    InputStream in;
    boolean start;
    int[] outBuf;
    int bufPtr;
    CRC24 crc;
    boolean crcFound;
    boolean hasHeaders;
    String header;
    boolean newLineFound;
    boolean clearText;
    boolean restart;
    StringList headerList;
    int lastC;
    boolean isEndOfStream;

    private int decode(int var1, int var2, int var3, int var4, int[] var5) throws EOFException {
        if (var4 < 0) {
            throw new EOFException("unexpected end of file in armored stream.");
        } else if (var3 == 61) {
            int var10 = decodingTable[var1] & 255;
            int var11 = decodingTable[var2] & 255;
            var5[2] = (var10 << 2 | var11 >> 4) & 255;
            return 2;
        } else {
            byte var6;
            byte var7;
            byte var8;
            if (var4 == 61) {
                var6 = decodingTable[var1];
                var7 = decodingTable[var2];
                var8 = decodingTable[var3];
                var5[1] = (var6 << 2 | var7 >> 4) & 255;
                var5[2] = (var7 << 4 | var8 >> 2) & 255;
                return 1;
            } else {
                var6 = decodingTable[var1];
                var7 = decodingTable[var2];
                var8 = decodingTable[var3];
                byte var9 = decodingTable[var4];
                var5[0] = (var6 << 2 | var7 >> 4) & 255;
                var5[1] = (var7 << 4 | var8 >> 2) & 255;
                var5[2] = (var8 << 6 | var9) & 255;
                return 0;
            }
        }
    }

    public ArmoredInputStream(InputStream var1) throws IOException {
        this(var1, true);
    }

    public ArmoredInputStream(InputStream var1, boolean var2) throws IOException {
        this.start = true;
        this.outBuf = new int[3];
        this.bufPtr = 3;
        this.crc = new CRC24();
        this.crcFound = false;
        this.hasHeaders = true;
        this.header = null;
        this.newLineFound = false;
        this.clearText = false;
        this.restart = false;
        this.headerList = Strings.newList();
        this.lastC = 0;
        this.in = var1;
        this.hasHeaders = var2;
        if (var2) {
            this.parseHeaders();
        }

        this.start = false;
    }

    public int available() throws IOException {
        return this.in.available();
    }

    private boolean parseHeaders() throws IOException {
        this.header = null;
        int var2 = 0;
        boolean var3 = false;
        this.headerList = Strings.newList();
        int var1;
        if (this.restart) {
            var3 = true;
        } else {
            while((var1 = this.in.read()) >= 0) {
                if (var1 == 45 && (var2 == 0 || var2 == 10 || var2 == 13)) {
                    var3 = true;
                    break;
                }

                var2 = var1;
            }
        }

        if (var3) {
            StringBuffer var4 = new StringBuffer("-");
            boolean var5 = false;
            boolean var6 = false;
            if (this.restart) {
                var4.append('-');
            }

            for(; (var1 = this.in.read()) >= 0; var2 = var1) {
                if (var2 == 13 && var1 == 10) {
                    var6 = true;
                }

                if (var5 && var2 != 13 && var1 == 10 || var5 && var1 == 13) {
                    break;
                }

                if (var1 == 13 || var2 != 13 && var1 == 10) {
                    String var7 = var4.toString();
                    if (var7.trim().length() == 0) {
                        break;
                    }

                    this.headerList.add(var7);
                    var4.setLength(0);
                }

                if (var1 != 10 && var1 != 13) {
                    var4.append((char)var1);
                    var5 = false;
                } else if (var1 == 13 || var2 != 13 && var1 == 10) {
                    var5 = true;
                }
            }

            if (var6) {
                this.in.read();
            }
        }

        if (this.headerList.size() > 0) {
            this.header = this.headerList.get(0);
        }

        this.clearText = "-----BEGIN PGP SIGNED MESSAGE-----".equals(this.header);
        this.newLineFound = true;
        return var3;
    }

    public boolean isClearText() {
        return this.clearText;
    }

    public boolean isEndOfStream() {
        return this.isEndOfStream;
    }

    public String getArmorHeaderLine() {
        return this.header;
    }

    public String[] getArmorHeaders() {
        return this.headerList.size() <= 1 ? null : this.headerList.toStringArray(1, this.headerList.size());
    }

    private int readIgnoreSpace() throws IOException {
        int var1;
        for(var1 = this.in.read(); var1 == 32 || var1 == 9; var1 = this.in.read()) {
        }

        return var1;
    }

    public int read() throws IOException {
        if (this.start) {
            if (this.hasHeaders) {
                this.parseHeaders();
            }

            this.crc.reset();
            this.start = false;
        }

        int var1;
        if (this.clearText) {
            var1 = this.in.read();
            if (var1 != 13 && (var1 != 10 || this.lastC == 13)) {
                if (this.newLineFound && var1 == 45) {
                    var1 = this.in.read();
                    if (var1 == 45) {
                        this.clearText = false;
                        this.start = true;
                        this.restart = true;
                    } else {
                        var1 = this.in.read();
                    }

                    this.newLineFound = false;
                } else if (var1 != 10 && this.lastC != 13) {
                    this.newLineFound = false;
                }
            } else {
                this.newLineFound = true;
            }

            this.lastC = var1;
            if (var1 < 0) {
                this.isEndOfStream = true;
            }

            return var1;
        } else {
            if (this.bufPtr > 2 || this.crcFound) {
                var1 = this.readIgnoreSpace();
                if (var1 != 13 && var1 != 10) {
                    if (var1 < 0) {
                        this.isEndOfStream = true;
                        return -1;
                    }

                    this.bufPtr = this.decode(var1, this.readIgnoreSpace(), this.readIgnoreSpace(), this.readIgnoreSpace(), this.outBuf);
                } else {
                    for(var1 = this.readIgnoreSpace(); var1 == 10 || var1 == 13; var1 = this.readIgnoreSpace()) {
                    }

                    if (var1 < 0) {
                        this.isEndOfStream = true;
                        return -1;
                    }

                    if (var1 == 61) {
                        this.bufPtr = this.decode(this.readIgnoreSpace(), this.readIgnoreSpace(), this.readIgnoreSpace(), this.readIgnoreSpace(), this.outBuf);
                        if (this.bufPtr == 0) {
                            int var2 = (this.outBuf[0] & 255) << 16 | (this.outBuf[1] & 255) << 8 | this.outBuf[2] & 255;
                            this.crcFound = true;
                            if (var2 != this.crc.getValue()) {
                                throw new IOException("crc check failed in armored message.");
                            }

                            return this.read();
                        }

                        throw new IOException("no crc found in armored message.");
                    }

                    if (var1 == 45) {
                        while((var1 = this.in.read()) >= 0 && var1 != 10 && var1 != 13) {
                        }

                        if (!this.crcFound) {
                            throw new IOException("crc check not found.");
                        }

                        this.crcFound = false;
                        this.start = true;
                        this.bufPtr = 3;
                        if (var1 < 0) {
                            this.isEndOfStream = true;
                        }

                        return -1;
                    }

                    this.bufPtr = this.decode(var1, this.readIgnoreSpace(), this.readIgnoreSpace(), this.readIgnoreSpace(), this.outBuf);
                }
            }

            var1 = this.outBuf[this.bufPtr++];
            this.crc.update(var1);
            return var1;
        }
    }

    public void close() throws IOException {
        this.in.close();
    }

    static {
        int var0;
        for(var0 = 65; var0 <= 90; ++var0) {
            decodingTable[var0] = (byte)(var0 - 65);
        }

        for(var0 = 97; var0 <= 122; ++var0) {
            decodingTable[var0] = (byte)(var0 - 97 + 26);
        }

        for(var0 = 48; var0 <= 57; ++var0) {
            decodingTable[var0] = (byte)(var0 - 48 + 52);
        }

        decodingTable[43] = 62;
        decodingTable[47] = 63;
    }
}