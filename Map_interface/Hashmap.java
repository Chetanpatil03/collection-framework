package Map_interface;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        // demonstration of hashmap

        // HashMap is a part of Java's collection framework
        // It stores data in key-value pairs and allows fast retrieval based on keys.
        // HashMap does not maintain any order of its elements and allows one null key and multiple null values. 

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1, "Chetan");
        map.put(null, "Prakash");
        map.put(3, "Prafulla");

        System.out.println(map);

        System.out.println(map.get(null));
        System.out.println(map.get(3));



    }
}
