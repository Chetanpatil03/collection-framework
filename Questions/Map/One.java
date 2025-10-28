import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class One {

    public static ArrayList<String> usrInput(Scanner sc){
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter elements :: ");
        // int n = sc.nextInt();

        while (true) {
            System.out.print(" :: ");
            list.add(sc.nextLine());
            System.out.print("Want to continue [Y/N] ::  ");
            char d = sc.nextLine().toCharArray()[0];
            if ( d == 'N' || d == 'n') {
                break;
            }
            else{
                // System.out.println();
                continue;
            }
        }
        return list;
    }

    public static HashMap<String,Integer> countFrequency(ArrayList<String> list){
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        for(String string : list){
            if (hashMap.containsKey(string)) {
                hashMap.replace(string, hashMap.get(string)+1);
            }else{
                hashMap.put(string, 1);
            }
        }


        return hashMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = usrInput(sc);

        


        System.out.println("List :: "+list);

        System.out.println("Frequency of every element : \n"+countFrequency(list));
    }
}
