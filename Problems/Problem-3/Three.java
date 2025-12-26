import java.util.Arrays;
import java.util.Map;

public class Three {
    // Count even and odd numbers in an array.
    public static Map<String,Integer> countEvenODD(int [] arr){
        int evenCount = 0, oddCount =0;

        for (int i : arr) {
            if (i % 2 == 0) evenCount++;
            else oddCount++;
        }

        return Map.of("Even :",evenCount,"Odd :",oddCount);
    }
    public static void main(String[] args) {
        int []arr = {12,59,4,59,14,9,841,8,9,51,48,54,18,5,4,19,685,41};
        System.out.println("Even and Odd Count :: "+countEvenODD(arr));
        System.out.println("Summ and Average :: "+calculateSumAvg(arr));
        System.out.print("Only evens : ");
        int [] newEven = onlyEvens(arr);
        for (int i : newEven) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static Map<String,Integer> calculateSumAvg(int []arr){
        int sum = 0;
        for (int i : arr) sum +=i;
        int avg = sum / arr.length;

        return Map.of("Average :",avg, "Sum :",sum);
    }

    public static int[] onlyEvens(int []arr){
            return Arrays.stream(arr).filter(x -> x%2 == 0).toArray();
    }
}

/*
-- 16. Count even and odd numbers in an array.
-- 17. Find the number of elements greater than a given value.
-- 18. Calculate sum + average of array elements.
-- 19. Create a new array containing only even numbers.
20. Multiply all elements of an array.
 */
