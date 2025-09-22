package Questions;

import java.util.ArrayList;

public class Two {
    public static void main(String[] args) {

        //one
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Guva");
        fruits.add("Graps");

        System.out.println("Fruits : ");
        fruits.forEach(x-> System.err.print(x+", "));

        //three
        int in = fruits.indexOf("Apple");
        fruits.set(in, "banana");

        System.out.println("\nFruits : ");
        fruits.forEach(x-> System.err.println(x+", "));

        //six
        System.out.println("is Apple exist : "+fruits.contains("Apple"));

        //nine 
        fruits.sort((var0x, var1x) -> var0x.compareTo(var1x));
        System.out.println(fruits);

    }
}

// 3. **Update an Element**
//    Update the second element in an `ArrayList` of Strings from `"Apple"` to `"Banana"`.

// 6. **Check if Element Exists**
//    Check whether a specific value exists in an `ArrayList`.

// 9. **Reverse an ArrayList**
//    Reverse the order of elements in an `ArrayList` of Strings.
