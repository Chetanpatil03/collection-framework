package Map_interface;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer,String> navigableMap = new TreeMap<>();

        navigableMap.put(4, "Four");
        navigableMap.put(1, "One");
        navigableMap.put(3,"Three");
        navigableMap.put(2, "Two");

        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(5));
        System.out.println(navigableMap.ceilingKey(3));
        System.out.println(navigableMap.higherEntry(2));
    }
}
