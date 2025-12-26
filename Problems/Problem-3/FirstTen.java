import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstTen {
    // Print numbers from 1 to 100 without using loops.
    public static void printNum(int n){
        if (n <= 100) {
            System.out.print(n+" ");
            printNum(n+1);
        }
    }

    // Count positive, negative, and zero values from an input list.
    public static Map<String, Integer> countNums(List<Integer> list){
        int zeros = 0,pos = 0, neg = 0;
        for (Integer i : list) {
            if (i == 0) zeros++;
            else if (i > 0) pos++;
            if (i < 0) neg++;
        }
        return Map.of("Postives",pos,"Zeros",zeros,"Negative",neg);
    }

    public static int averageOfN(ArrayList<Integer> list){
        int n = list.size();
        System.out.println("\n\nSize of N :: "+n);
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }

        return sum / n;
    }

    public static void printMultiplicationTable(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+"  *  "+i+"  := "+(n*i));
        }
    }
    // Print all factors of a number.
    public static void printAllFactorsOfNum(int n){
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.println(i);
        }
    }

    // Convert Celsius to Fahrenheit.
    public static double celsiusTFahrenheit(double cel){
        return (cel * 9/5) + 32;
        // return (0°F − 32) × 5/9 = -17.78°C -- fahrenheit to celcius
    }
    
    public static double fahrenheitTOCelsius(double fhr){
        return (fhr - 32) * 5/9;
    }

    public static long calculatePower(int n, int pow){
        long res = 1;
        for (int i = 1; i <= pow; i++) {
            res *= n;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println("Sequence ::  ");
        printNum(1);

        System.out.println("Average of N :: "+averageOfN(new ArrayList<>(Arrays.asList(12,58,67,69,6,8,9,86,6,65,8,9,6,6,56,46,54))));

        System.out.println("Result :: "+countNums(Arrays.asList(12,5,6,9,9,6,-19,57,-14,0,8,-95,6,-6,59,5,-7,62,-6,26,-56,0,0,20)));

        System.out.println("Multiplication table of 8 :: ");
        printMultiplicationTable(8);

        System.out.println("All factors of number [54]");
        printAllFactorsOfNum(54);

        System.out.println("Celcius to Fahreheit (14 C) :: "+celsiusTFahrenheit(14));
        System.out.println("Fahreheit to Celcius (274 F) :: "+fahrenheitTOCelsius(274));

        System.out.println("Finding power of 3 rest 9 :: "+calculatePower(3, 9));
        System.out.println("Finding power of 3 rest 9 :: "+Math.pow(3, 9));
        
    }
}

/*
### **Basic Program Logic**

-- 1. Print numbers from 1 to 100 without using loops.
-- 2. Find the average of N numbers.
-- 3. Convert Celsius to Fahrenheit.
4. Check if a character is a vowel, consonant, digit, or special character.
-- 5. Count positive, negative, and zero values from an input list.
-- 6. Find the largest and smallest digit in a number.
7. Convert lowercase string to uppercase (without using built-in).
-- 8. Print multiplication table of a number.
-- 9. Calculate power of a number without using Math.pow().
-- 10. Print all factors of a number.
 */


// ctrl + shift + p --> clean java language server workplace
