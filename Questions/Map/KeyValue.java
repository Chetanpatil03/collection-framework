package Map;

import java.util.HashMap;
import java.util.Scanner;

public class KeyValue {

    static HashMap<Integer,String> students = new HashMap<>();
    public static void addStudent(int id,String name){
        students.put(id, name);
    }

    public static void main(String[] args) {
        System.out.println("**** Welcome **********");
        Scanner sc = new Scanner(System.in);
        int ch;
        while (true) {
            System.out.println("1.Add student 2.View Students 3.Delete Students 4.List students 5.Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter Id : ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    addStudent(id, name);
                    
                    break;
            
                default:
                    break;
            }
        }
    }
}


