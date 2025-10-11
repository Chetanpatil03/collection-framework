package Questions;

import java.util.ArrayList;

public class One {
    public static void main(String[] args) {
        //one
        ArrayList<String> names = new ArrayList<>();
        names.add("Chetan");
        names.add("Prakash");
        names.add("bhavesh");
        names.add("prafulla");
        names.add("navjit");

        //seven
        System.out.print("Names : ");
        for (String string : names) {
            System.out.print(string+", ");
        }

        //two
        System.out.println("\nPerson at second index is : "+names.get(2));

        //four

        names.remove(0); //index starts with 0
        System.out.print("Names : ");
        names.forEach(x-> System.out.print(x+", "));

        // five 
        System.out.println("\nArraylist size : "+names.size());






    }


}

//  -- 1. **Create and Add Elements**
//    Create an `ArrayList` of Strings. Add 5 names to it and print the list.

// -- 2. **Access Elements**
//    Given an `ArrayList` of integers, print the element at index 2.

// -- 4. **Remove an Element**
//    Remove the element at index 1 from an `ArrayList` of integers.

// -- 5. **Find the Size**
//    Create an `ArrayList` of doubles. Add a few elements and print the size.

// 7. **Iterate Over an ArrayList**
//    Use a `for` loop to print all elements in an `ArrayList` of Strings.