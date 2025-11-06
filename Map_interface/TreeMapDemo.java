package Map_interface;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(3, "Nikhil");
        map.put(4, "Dipak");
        map.put(1, "Chetan");
        map.put(2, "Prafull");

        System.out.println(map);
    }
}
