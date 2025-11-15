import java.util.Scanner;

public class Pallindrom {

    public static boolean isPallindrom(String string){
        return string.equals(new StringBuffer(string).reverse().toString());
    }
    public static void main(String[] args) {
        System.out.print("Enter String :: ");
        Scanner sc = new Scanner(System.in);

        String inp = sc.nextLine();

        System.out.print("The string [ " +inp+ " ] is :: ");
        System.out.println(isPallindrom(inp) ?"Pallindrom" :"Not a pallindrom");
        sc.close();

    }
}
