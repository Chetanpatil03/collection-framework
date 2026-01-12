import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestNumber {
    public static void main(String[] args) {
        int [] arr = {15,9,6,7,8,5,9,64,25,869,94,6,45};
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(x -> System.out.print(x+" "));
        System.out.println("\nFinding "+2+"th largest number :: "+kthLargestNumber(arr, 2));
    }

    public static int kthLargestNumber(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : arr) {
            pq.offer(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
}
