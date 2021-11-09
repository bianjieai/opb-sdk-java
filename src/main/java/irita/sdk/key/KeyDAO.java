package irita.sdk.key;

public interface KeyDAO {
    void write(String name, String password, KeyInfo keyInfo);

    KeyInfo read(String name, String password);

    void delete(String name, String password);

    boolean has(String name);
}
