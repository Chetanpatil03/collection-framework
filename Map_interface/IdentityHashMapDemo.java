package Map_interface;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

        String key_one = new String("Key");
        String key_two = new String("Key");
        
        // // hashmap uses hashcode and equals
        // Map<String,Integer> map = new HashMap<>(); 
        // map.put(key_one, 1);
        // map.put(key_two, 2);
        // System.out.println(key_one.hashCode()); //same 
        // System.out.println(key_two.hashCode()); // same
        

        // identityHashMap uses identityHashCode and == (equals to) for memory address
        // if you want to see just use String key = "key";

        Map<String,Integer> map = new IdentityHashMap<>(); 
 
        map.put(key_one, 1); // diff hashcode
        map.put(key_two, 2); //diff hashcode
        
        System.out.println(key_one == key_two); //false because it is in heap memory (cause of new )
        System.out.println(System.identityHashCode(key_one));
        System.out.println(System.identityHashCode(key_two));



        System.out.println(map);
    }
}
