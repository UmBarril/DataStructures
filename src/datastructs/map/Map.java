package datastructs.map;

public interface Map<K, V> {
    boolean put(K key, V value);
    boolean remove(K key);
    boolean get(K key);
}
