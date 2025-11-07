package Map_interface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        // Three ways to create immutable maps

        // 1 --> Collections.unmodifiableMap();

        Map<Integer,String> map = new HashMap<>();
        map.put(1, "chetan");
        map.put(2, "dipak");
        map.put(3, "prafull");

        // using unmodifiableMap
        Map<Integer, String> unmodifiableMap = Collections.unmodifiableMap(map);
        //unmodifiableMap.put(4, "nikhil"); //throw UnsupportedOperationException exception

        System.out.println(unmodifiableMap);

    }
}
