package Map_interface;

import java.util.LinkedHashMap;

public class LRUCache<K,V> extends LinkedHashMap<K,V>{

    private int capacity;
    public LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<String,Integer> cache = new LRUCache<>(3);

        cache.put("Chetan", 88);
        cache.put("Ram ", 88);
        cache.put("Ganan", 86);

        System.out.println(cache);

        // if another entry is added then least accessed entry will be removed.
        // for ex --> if added ("prafull",80) --> then chetan will be removed

        cache.put("Prafulla", 80);
        System.out.println(cache);

        // cache.get("Ram ");
        // cache.put("Suresh", 90);
        // System.out.println(cache);



    }
}


/**
     * Demonstrates the usage of the LRUCache class with String keys and Integer values.
     * <p>
     * The main method performs the following actions:
     * <ul>
     *   <li>Creates an LRUCache instance with a maximum capacity of 3 entries.</li>
     *   <li>Adds three key-value pairs to the cache.</li>
     *   <li>Prints the current state of the cache.</li>
     *   <li>Adds a fourth entry, causing the least recently used entry to be evicted.</li>
     *   <li>Prints the updated state of the cache after eviction.</li>
     *   <li>Contains commented-out code for further cache operations and printing.</li>
     * </ul>
     * This example illustrates how the LRU (Least Recently Used) eviction policy works in the cache.
     *
     * 
     */