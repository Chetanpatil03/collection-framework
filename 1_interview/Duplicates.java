import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicates {
    public static void main(String[] args) {
        int [] arr = {1,2,3,65,4,8,54,854,44,54,21,5,85,1,65,5,4};
        System.out.println("Duplicates :: "+duplicateElements(arr));
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

        list.sort(null);
        return list;
    }
}
