package Random;
import java.util.Scanner;

public class Pallindrom {

    public static boolean isPallindromString(String string){
        return string.equals(new StringBuffer(string).reverse().toString());
    }

    public static String inpString(Scanner sc){
        System.out.print("Enter String :: ");
        sc.nextLine();
        return sc.nextLine();
    }

    public static int revNum(int n){
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }

        return rev;
    }

    public static boolean isNumPallindrom(int number){
        return number == revNum(number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What do you want to do[1.INT 2.String 3.EXIT] :: ");
        int ch = sc.nextInt();
        if (ch == 2) {
            String string = inpString(sc);
            System.out.print("The string [ " +string+ " ] is :: ");
            System.out.println(isPallindromString(string) ?"Pallindrom" :"Not a pallindrom");
        }
        else if (ch == 1) {
            System.out.print("Enter number :: ");
            int number = sc.nextInt();
            System.out.print("The string [ " +number+ " ] is :: ");
            System.out.println(isNumPallindrom(number)?"Pallindrom" :"Not a pallindrom");
        }
        sc.close();

        // System.out.println("reverse numbers [12354] :: "+revNum(12354));

    }
}
