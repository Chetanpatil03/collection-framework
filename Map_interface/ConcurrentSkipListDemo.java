package Map_interface;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String,Integer> map = new ConcurrentSkipListMap<>();
        map.put("Apple", 2);
        map.put("Banana", 2);
        map.put("Chikku", 2);
        System.out.println(map);

        map.putIfAbsent("Date", 4);
        map.replace("Banana", 2, 3);
        System.out.println("After putIfAbsent/replace: " + map);

        System.out.println("Ordered keys: " + map.keySet());
        System.out.println("Submap [Apple..Chikku]: " + map.subMap("Apple", true, "Chikku", true));

        Thread writer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                map.put("K" + i, i);
                try { Thread.sleep(50); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
        });

        Thread reader = new Thread(() -> {
            for (String k : map.keySet()) {
                System.out.println("Iterated key: " + k);
                try { Thread.sleep(75); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
        });

        writer.start();
        reader.start();
        try {
            writer.join();
            reader.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        java.util.Map.Entry<String,Integer> first = map.pollFirstEntry();
        System.out.println("Polled first entry: " + first);
        System.out.println("Final map: " + map);

        // 
    }
}
