package Questions;

import java.util.ArrayList;

public class One {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Chetan");
        names.add("Prakash");
        names.add("bhavesh");
        names.add("prafulla");
        names.add("navjit");

        System.out.print("Names : ");
        for (String string : names) {
            System.out.print(string+", ");
        }

        System.out.println("\nPerson at second index is : "+names.get(2));

        


    }


}

//  -- 1. **Create and Add Elements**
//    Create an `ArrayList` of Strings. Add 5 names to it and print the list.

// -- 2. **Access Elements**
//    Given an `ArrayList` of integers, print the element at index 2.
