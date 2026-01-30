import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,6,8,9,5,3,4,9,25,5,24,2,6,5,45);
        System.out.println("Original List :: "+list);

        int[] arr = list.stream().mapToInt(x-> x).toArray();
        

    }
}
