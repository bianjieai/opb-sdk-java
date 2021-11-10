package irita.sdk.key;

import java.util.HashMap;
import java.util.Map;

public class MemoryKeyDAO implements KeyDAO {
    private final Map<String, KeyInfo> store = new HashMap<>();

    @Override
    public void write(String name, String password, KeyInfo keyInfo) {
        store.put(name, keyInfo);
    }

    @Override
    public KeyInfo read(String name, String password) {
        return store.get(name);
    }

    @Override
    public void delete(String name, String password) {
        store.remove(name);
    }

    @Override
    public boolean has(String name) {
        return store.get(name) != null;
    }
}
