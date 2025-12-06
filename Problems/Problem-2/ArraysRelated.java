import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArraysRelated {

    // Que - 1 Find min and max element in array
    public static int minElement(int []arr){
        int min = arr[0];
        for(int i : arr) if (min > i) min = i;
        return min;
    }

    // finding max element : 
    public static int maxElement(int []arr){
        int max = arr[0];
        for(int i : arr) if (max < i) max = i;
        return max;
    }

    // combined approch
    public static Map<String,Integer> minMaxElement(int []arr){
        int min = arr[0]; 
        int max = arr[0];
        for (int i : arr) {
            if (max < i) max = i;
            if (min > i) min = i;
        }

        return Map.of("Minimum :", min, "Maximum :",max);
    }

    // 9. Check if two arrays are equal.
    public static boolean isArraysEqual(int []arr, int []arr2){
        if (arr.length == arr2.length) return false;
        Arrays.sort(arr);
        Arrays.sort(arr2);
        return Arrays.equals(arr, arr2);
    }

    public static HashMap<Integer,Integer> findFrequency(ArrayList<Integer> list){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer integer : list) {
            map.put(integer, map.getOrDefault(map, 0) + 1);
        }

        return map;
    }

    // merge two arrays into single array
    public static ArrayList<Integer> mergeTwoArray(int []arr, int []arr2){
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.sort(arr2);

        for (int i : arr) list.add(i);
        for (int i : arr2) list.add(i);
        return list;
    }

    // remove duplicate elements
    public static void removeDuplicates(int []arr){
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.stream(arr).forEach(x->{
            list.add(x);
        });
        list.sort(null);

        ArrayList<Integer> unique_list = new ArrayList<>(new HashSet<>(list));
        unique_list.sort(null);
        System.out.println("Unique elements" + unique_list);
    }

    public static void printArr(int []arr){
        Arrays.sort(arr);
        System.out.print("Array :: [ ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.print(" ] \n");
    }

    public static ArrayList<Integer> findMissingNumber(int []arr,int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) list.add(i);
        for (int i : arr) list.remove(Integer.valueOf(i));

        return list;
    }

    

    public static void main(String[] args) {
        int [] arr = {1,5,8,6,8,9,5,7,6,9,2,67,6,2,94,-52,14,996,-94};
        int [] arr_one = {1,2,3,5,6,8,9,11,13,15,19};
        System.out.println("Minimum and Maximum element :: "+minMaxElement(arr));
        System.out.println("Compare : "+isArraysEqual(arr, arr));
        printArr(arr);
        removeDuplicates(arr);

        System.out.println("Array List :: "+findMissingNumber(arr_one, 20));
    }
}

/*# 
🔥 **Array Coding Questions**

-- 1. Find the largest and smallest number in an array.
-- 2. Reverse an array.
-- 3. Find the missing number in an array of 1 to N.
-- 4. Remove duplicate elements from an array.
5. Find the second largest number in an array.
-- 6. Find the frequency of each element in an array.
7. Rotate an array (left/right).
-- 8. Merge two sorted arrays into a single sorted array.
-- 9. Check if two arrays are equal.
10. Find pairs in an array whose sum is equal to a given number.
 */
