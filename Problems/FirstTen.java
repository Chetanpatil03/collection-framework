

/*
1. Write a program to print "Hello, World!".
2. Write a program to add two numbers and print the result.
3. Write a program to check if a number is even or odd.
4. Write a program to find the largest of three numbers.
5. Write a program to print the multiplication table of a given number.
6. Write a program to calculate the factorial of a number.
7. Write a program to reverse a string.
8. Write a program to check if a string is a palindrome.
9. Write a program to find the sum of all elements in an array.
10. Write a program to count the number of vowels in a string.
 */


public class FirstTen {

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



    public static void main(String[] args) {
        
    }
}
