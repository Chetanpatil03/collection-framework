import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("After removing Duplicates :: "+removeDuplicateString("bachchhav"));

        showDuplicates(new int[]{2,5,3,7,8,9,6,2,8,9,6,4});
        secondMax(new int[]{2,5,3,7,8,9,6,2,8,6,4});
    }

    public static String removeDuplicateString(String str){
        StringBuffer sb = new StringBuffer();
        HashSet<Character> exist = new HashSet<>();
        // ArrayList<Integer> duplicates = new ArrayList<>();

        for (char c : str.toCharArray()) {
            // if (!exist.contains(c)) {
            //     exist.add(c);
            //     sb.append(c);
            // }

            exist.add(c);
        }

        return exist.toString();
    }

    public static void showDuplicates(int [] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> dupli = new ArrayList<>();
        List<Integer> unique = new ArrayList<>();
        

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                dupli.add(entry.getKey());
            }
            else{
                unique.add(entry.getKey());
            }
        }

        Collections.sort(dupli);
        Collections.sort(unique);

        System.out.println("Duplicates :: "+dupli);
        System.out.println("Unique :: "+unique);
    }

    public static void secondMax(int[] arr){
        int max = arr[0]; 
        int secMax = arr[0]; 

        for (int i : arr) {
            if (i >= max) {
                secMax = max;
                max = i;
            }
            else if(i >= secMax && i < max){
                secMax = i;
            }
        }

        System.out.println("Second max :: "+secMax);
    }
}
