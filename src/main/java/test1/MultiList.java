package test1;

import java.util.*;

public class MultiList<K, V> {
    private Map<K, List<V>> map = new HashMap<>();

    public void add(K key, V value) {
        if (!map.containsKey(key)) {
            List<V> list = new ArrayList<>();
            map.put(key, list);
        }
        List<V> list = map.get(key);
        list.add(value);
    }

    List<V> get(K key) {
        List<V> list = map.get(key);
        if (list != null) {
            return Collections.unmodifiableList(list);
        } else {
            return Collections.emptyList();
        }
    }
}

