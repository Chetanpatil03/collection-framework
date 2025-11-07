package Map_interface;
import java.security.KeyStore.Entry;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        // Three ways to create immutable maps
        // Collections.unmodifiableMap();
        // Map.of()
        // Map.ofEntry()

        // 1 --> Collections.unmodifiableMap();

        Map<Integer,String> map = new HashMap<>();
        map.put(1, "chetan");
        map.put(2, "dipak");
        map.put(3, "prafull");

        // using unmodifiableMap
        Map<Integer, String> unmodifiableMap = Collections.unmodifiableMap(map);
        //unmodifiableMap.put(4, "nikhil"); //throw UnsupportedOperationException exception
        System.out.println(unmodifiableMap);

        // way --> 2 : using Map.of --> but it can only consist 10 key-value pair.

        Map<Integer, String> immitubleMap = Map.of(1,"chetan",2,"ishwar",3,"navjit");
        // was introduced in java 9
        System.out.println(immitubleMap);


        // way three to create immutable map

        Map<Integer, String> ofEntries = Map.ofEntries(Map.entry(1,"Chetan"),Map.entry(2,"Dipak"));
        // you can fill any number of entries using Map.ofEntries() 
        // introduced to recover Map.of()

        System.out.println(ofEntries);
        


    }
}
