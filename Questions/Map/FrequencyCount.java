//🧩 1. Counting Frequency of Elements

//Use HashMap to count how many times each element appears in a list or string.

import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "apple", "mango", "banana", "apple"};
        HashMap<String, Integer> map = new HashMap<>();

        for (String fruit : fruits) {
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);
        }

        System.out.println(map); // {apple=3, banana=2, mango=1}
    }
}
