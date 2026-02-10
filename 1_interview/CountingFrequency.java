import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountingFrequency {
    public static void main(String[] args) {
        int [] arr = {1,5,1,2,5,9,14,8,58,2,5,8,75,9,5,5,9,2};
        // System.out.println("Frequency of elements :: "+countFrequency(arr));
        // System.out.println("Frequency of elements :: "+countFrequencySorted(arr));

        // System.out.println("Frequency :: "+countCharacterFrequency("Chetan bachchhav "));

        numberWithHighestFrequency(arr);
    }

    public static Map countFrequency(int []arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) map.put(i, map.getOrDefault(i, 0)+1);
        return map;
    }

    public static Map countFrequencySorted(int []arr){
        Arrays.sort(arr);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i : arr) map.put(i, map.getOrDefault(i, 0)+1);
        return map;
    }

    public static Map countCharacterFrequency(String str){
        char [] arr = str.trim().toCharArray();
        Arrays.sort(arr);

        Map<Character, Integer> map = new HashMap<>();
        for (char c : arr) map.put(c, map.getOrDefault(c, 0)+1);

        return map;
    }

    public static void numberWithHighestFrequency(int []arr){
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i : arr) 
            hashMap.put(i, hashMap.getOrDefault(i, 0)+1);

        int freq = 1;
        int num = arr[0];

        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > freq) {
                freq = entry.getValue();
                num = entry.getKey();
            }
        }


        System.out.println("Number :: "+num+" | Occurance :: "+freq);
    }

}
