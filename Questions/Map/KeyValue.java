package Map;

import java.util.HashMap;
import java.util.Scanner;

public class KeyValue {

    static HashMap<Integer,String> students = new HashMap<>();
    public static void addStudent(int id,String name){
        students.put(id, name);
    }

    public static void viewStudentDetails(int id){
        if (students.containsKey(id)) {
            System.out.println("Student : "+students.get(id));
        }
        else{
            System.out.println("Details not found....");
        }
    }

    public static void main(String[] args) {
        System.out.println("**** Welcome **********");
        Scanner sc = new Scanner(System.in);
        int ch,id;
        String name;
        while (true) {
            System.out.println("1.Add student 2.View Students 3.Delete Students 4.List students 5.Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter Id : ");
                    id = sc.nextInt();
                    System.out.print("Enter Name : ");
                    name = sc.nextLine();
                    addStudent(id, name);
                    break;
                case 2:
                    System.out.println("Enter id : ");
                    id = sc.nextInt();
                    viewStudentDetails(id);
                    break;
                
                case
                default:
                    break;
            }
        }
    }
}


