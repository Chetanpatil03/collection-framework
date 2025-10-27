import java.util.ArrayList;
import java.util.Scanner;

public class One {

    public static ArrayList<Integer> usrInput(Scanner sc){
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter elements :: ");
        int n = sc.nextInt();

        while (true) {
            System.out.print(" :: ");
            list.add(sc.nextLine());
            System.out.println("Want to continue [Y/N] ::  ");
            if (sc.nextLine()[0] == 'N' || sc.nextLine()[0] == 'n') {
                break;
            }
        }

        return list;
        

    }

    public static void main(String[] args) {
        
    }
}
