import java.util.ArrayList;
import java.util.Comparator;

class Student{
    private String name;
    private String Class;
    private double CGPA;


    public Student(String name, String class1, double cGPA) {
        this.name = name;
        Class = class1;
        CGPA = cGPA;
    }


    public String getName() {
        return name;
    }


    public double getCGPA() {
        return CGPA;
    }

    @Override
    public String toString() {
        return name+": "+CGPA+" ";
    }
}

public class Comparator_2 {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();

        studentsList.add(new Student("Alice", "10th", 4.2));
        studentsList.add(new Student("Bob", "9th", 3.8));
        studentsList.add(new Student("Charlie", "11th", 2.9));
        studentsList.add(new Student("David", "12th", 4.7));
        studentsList.add(new Student("Eva", "8th", 1.5));

        System.out.println(studentsList);

        //sort student according CGPA

        studentsList.sort((a,b)->{
            if (b.getCGPA() - a.getCGPA() > 0) {
                return 1;
            }
            else if(b.getCGPA() - a.getCGPA() < 0){
                return -1;
            }
            else{
                return a.getName().compareTo(b.getName());
            }
        });

        System.out.println("After sorting : ");
        System.out.println(studentsList);



        // studentsList.sort(Comparator.comparing(Student::getCGPA));
        // System.out.println("After");
        // System.out.println(studentsList);

        studentsList.sort(Comparator.comparing(Student::getCGPA).thenComparing(Student::getName)); //method chaining -- alice bob have same cgpa (4,4) then sorting will be done by their names
        System.out.println("After");
        System.out.println(studentsList);

    }
}
