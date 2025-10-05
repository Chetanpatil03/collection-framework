import java.util.ArrayList;
import java.util.Arrays;

public class Ten {

    public static int countEven(ArrayList<Integer> list){
        int count = 0;
        for (Integer i : list) {
            if (i % 2 ==0) {
                count++;
            }
        }
        return count;
    }

    public static int countOdd(ArrayList<Integer> list){
        int count = 0;
        for (Integer i : list) {
            if (i % 2 !=0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));

        System.out.println("Even Numbers : "+countEven(list));
        System.out.println("Odd Numbers : "+countOdd(list));
    }
}

// 41. **Find the First Repeating Element**
//     Find the first element that appears more than once in an `ArrayList`.

// 42. **Find the First Non-Repeating Element**
//     Find the first element that appears only once in an `ArrayList`.

// 43. **Count Even and Odd Numbers**
//     Count how many even and odd numbers are present in an `ArrayList`.

// 44. **Move All Zeroes to End**
//     Rearrange an `ArrayList` so that all `0`s are moved to the end, maintaining the order of non-zero elements.

// 45. **Left Rotate by One Position**
//     Rotate the `ArrayList` to the left by one position (first element moves to end).
