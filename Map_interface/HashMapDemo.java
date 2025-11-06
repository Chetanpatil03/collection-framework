package Map_interface;

import java.util.Hashtable;

public class HashMapDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();

        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cherry");
        // hashtable.put(4, null); --> throws exception
        // hashtable.put(null,"mango") --> throws exception

        System.out.println(hashtable.get(2));
        System.out.println(hashtable.containsKey(2));
        System.out.println(hashtable);

    }
}
