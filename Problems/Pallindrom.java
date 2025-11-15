import java.util.Scanner;

public class Pallindrom {

    public static boolean isPallindromString(String string){
        return string.equals(new StringBuffer(string).reverse().toString());
    }

    public static String inpString(Scanner sc){
        System.out.print("Enter String :: ");
        return sc.nextLine();
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
            
        }

        sc.close();

    }
}
