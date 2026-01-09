import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicates {
    public static void main(String[] args) {
        i 
    }

    public static List<Integer> duplicateElements(int [] arr){
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i : arr) hashMap.put(i, hashMap.getOrDefault(i, 0)+1);

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() >= 2) {
                list.add(entry.getKey());
            }
        }

        return list;
    }
}
