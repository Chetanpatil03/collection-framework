public class OneTen {
       // one 
    public static void printHelloWorld(){
        System.out.println("Hello World!");
    }

    // two 
    public static int addTwoNum(int a,int b){
        return a + b;
    }

    //three
    public static String isEvenOrOdd(int a){
        if (a % 2 ==0) {
            return "Even";
        }
        else{
            return "Odd";
        }
    }

    // four - A
    public static int greatesOfThree_A(int a,int b,int c){
        return Math.max(Math.max(a, b), c);
    }

    //four - B
    public static int greatesOfThree_B(int a,int b,int c){
        return a > b ?( a > c ? a : c) : b > c ? b : c; 
    }

    // five
    public static void multiplicationTable(int n){
        for(int i = 1; i<=10;i++){
            System.out.println(n+" * "+i+" = "+ n*i + "");
        }
    }

    // six:: A -- factorial {Iterative}
    public static int factorial_A(int n){
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        
        return res;
    }
    
    // six:: B -- factorial{Recursive}
    public static int factorial_B(int n){
        if (n <= 0 || n == 1) {
            return 1;
        }
        else{
            return n * factorial_B(n-1);
        }
    }

    // seven
    public static String revString(String s){
        return new StringBuffer(s).reverse().toString();
    }
  
    //  que. eigth :: way - one
    public static boolean isPallindrom(String s){
        return new StringBuffer(s).reverse().toString().equals(s);
    }

    // que. eigth :: way - two
    public static boolean isPallindrom_B(String s){
        return revString(s).equals(s);
    }

    // finding sum of all array elements
    public static int arraySum(int [] arr){
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }


    // que - 10 :: to count the number of vowel in string 
    public static int countVowels(String s){
        int count = 0;
        char [] charArray = s.toLowerCase().toCharArray();
        for (char c : charArray) {
            if (c == 'a'|| c == 'e' || c== 'i'|| c == 'o'|| c=='u') continue;
            else count++;
        }
        return count;
    }

    // question number :: 5 - reverse a given number
    public static int revNumber(int n){
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        return rev;
    }
    
    public static void main(String[] args) {
        System.out.println("Reverse of [2548] :: "+revNumber(2548));
    }
}

/*1. 
-- Write a program to check if a number is even or odd.
-- 2. Find the largest of three numbers.
-- 3. Check if a number is prime.
-- 4. Print Fibonacci series up to N terms.
-- 5. Reverse a number.
-- 6. Check if a string is a palindrome.
7. Count vowels and consonants in a string.
-- 8. Find the factorial of a number.
-- 9. Swap two numbers without using a third variable.
10. Find the sum of digits of a number.
 */
