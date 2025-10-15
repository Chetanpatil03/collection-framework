package Map_interface;

import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_demo {

    public static void main(String[] args) {
        LinkedHashMap<String,Integer> fruits = new LinkedHashMap<>(10,0.8f,true);

        fruits.put("Apple", 30);
        fruits.put("Mango", 30);
        fruits.put("banana", 30);
        fruits.put("tomato", 30);
        fruits.put("guva", 30);

        fruits.get("Apple");
        fruits.get("banana");
        fruits.get("Apple");
        fruits.get("guva");
        

        for (Map.Entry<String,Integer> entry : fruits.entrySet()) {
            System.out.println(entry.getKey() +" = "+entry.getValue()); //accessorder
            // list recently used --> accessed order
            // visited / accessed elements are in the last of next iteration of the list.
        }
    }
}