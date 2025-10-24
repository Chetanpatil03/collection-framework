package List;

import java.util.ArrayList;

public class Eleven {
//  47 :: finding element that are on even indices
    public static ArrayList<Integer> evenIndices(ArrayList<Integer> list){
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i%2 == 0 || i==0) {
                evenList.add(list.get(i));
            }
        }

        return evenList;
    }
// 47[b] :: oddIndices
    public static ArrayList<Integer> oddIndices(ArrayList<Integer> list){
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i%2 == 1) {
                oddList.add(list.get(i));
            }
        }

        return oddList;
    }

    public static void main(String[] args) {
        System.out.println("Chetan Bachchhav");
    }
}

// 46. **Right Rotate by K Positions**
//     Rotate the `ArrayList` to the right by `k` positions.

// 47. **Sum of Elements at Even Indices**
//     Find the sum of elements at even indices in an `ArrayList`.

// 48. **Find Pairs with Given Sum**
//     Print all pairs of elements from an `ArrayList` whose sum is equal to a given number.

// 49. **Find Triplets with Given Sum**
//     Find all triplets in the `ArrayList` that sum up to a given value.

// 50. **Check if Two Lists are Disjoint**
//     Determine if two `ArrayList`s have no elements in common.