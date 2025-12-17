import java.util.ArrayList;

public class FirstTen {
    // Print numbers from 1 to 100 without using loops.
    public static void printNum(int n){
        if (n <= 100) {
            System.out.print(n+" ");
            printNum(n+1);
        }
    }

    public static int averageOfN(ArrayList<Integer> list){
        int n = list.size();
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }

        return sum / n;
    }

    public static void main(String[] args) {
        System.out.println("Sequence ::  ");
        printNum(1);

        
    }
}

/*
### **Basic Program Logic**

-- 1. Print numbers from 1 to 100 without using loops.
-- 2. Find the average of N numbers.
3. Convert Celsius to Fahrenheit.
4. Check if a character is a vowel, consonant, digit, or special character.
5. Count positive, negative, and zero values from an input list.
-- 6. Find the largest and smallest digit in a number.
7. Convert lowercase string to uppercase (without using built-in).
8. Print multiplication table of a number.
9. Calculate power of a number without using Math.pow().
10. Print all factors of a number.
 */


// ctrl + shift + p --> clean java language server workplace
