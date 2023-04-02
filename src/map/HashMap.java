package map;

public class HashMap<K, V> implements Map<K, V> {
    @Override
    public boolean put(K key, V value) {
        return false;
    }

    @Override
    public boolean remove(K key) {
        return false;
    }

    @Override
    public boolean get(K key) {
        return false;
    }
}
