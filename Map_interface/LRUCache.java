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

    }
}
