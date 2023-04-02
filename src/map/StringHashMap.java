package map;

import list.LinkedList;

public class StringHashMap<V> implements Map<String, V> {
    public class Pair<K, V> {
        public K key;
        public V value;
    }
    private LinkedList<Pair<String, V>> array;
    public StringHashMap() {
        array = new LinkedList<>();
    }
    @Override
    public boolean put(String key, V value) {
        return false;
    }

    @Override
    public boolean remove(String key) {
        return false;
    }

    @Override
    public boolean get(String key) {
        return false;
    }

}
