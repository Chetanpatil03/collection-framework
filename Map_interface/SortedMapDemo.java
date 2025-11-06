package Map_interface;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        // why SortedMap<>
        // is an interface that extends Map and guarantees that the entries are sorted based 
        // on the keys either in their natural ordering or by a specified comparator.

        SortedMap<String, Integer> map = new TreeMap<>();
        map.put("Prafulla",78);
        map.put("nikhil", 80);
        map.put("Chetan", 80);
        map.put("dipak", 68);

        System.out.println(map); 
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap("dipak"));
        System.out.println(map.tailMap("dipak"));


    }
}
