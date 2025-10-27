import java.util.ArrayList;
import java.util.Scanner;

public class One {

    public static ArrayList<String> usrInput(Scanner sc){
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter elements :: ");
        int n = sc.nextInt();

        while (true) {
            System.out.print(" :: ");
            list.add(sc.nextLine());
            System.out.println("Want to continue [Y/N] ::  ");
            char d = sc.nextLine().toCharArray()[0];
            if ( d == 'N' || d == 'n') {
                break;
            }
            else{
                System.out.println();
                continue;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        
    }
}
