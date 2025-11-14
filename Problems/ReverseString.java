import java.util.Scanner;

public class ReverseString {
    public static String revString(String str){
        return new StringBuffer(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        System.out.println("Original :: "+string);
        System.out.println("Reverse  :: "+revString(string));
        sc.close();
    }
}
