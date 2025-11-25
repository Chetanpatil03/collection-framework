public class ArraysRelated {

    // Que - 1 Find min and max element in array
    public static int min(int []arr){
        int min = arr[0];
        for(int i : arr) if (min > i) min = i;
        return min;
    }

    public static void main(String[] args) {
        
    }
}

/*# 
🔥 **Array Coding Questions**

1. Find the largest and smallest number in an array.
2. Reverse an array.
3. Find the missing number in an array of 1 to N.
4. Remove duplicate elements from an array.
5. Find the second largest number in an array.
6. Find the frequency of each element in an array.
7. Rotate an array (left/right).
8. Merge two sorted arrays into a single sorted array.
9. Check if two arrays are equal.
10. Find pairs in an array whose sum is equal to a given number.
 */
