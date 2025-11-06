package Map_interface;

import java.util.HashMap;
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

        // Example : concurrency
        HashMap<Integer,String> map = new HashMap<>();
        Hashtable<Integer,String> hashtable_two = new Hashtable<>();
 
        Thread thread = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread-1");
                hashtable_two.put(i, "Thread-1");
                
            }
        });
        
        Thread thread_2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread-2");
                hashtable_two.put(i+1000, "Thread-2");
            }
        });

        thread.start();
        thread_2.start();

        try{
            thread.join();
            thread_2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Size of Map : "+map.size());
        System.out.println("Size of HashTable : "+hashtable_two.size());
        

    }
}
