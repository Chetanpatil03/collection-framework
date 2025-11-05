import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // list.add(new Student("Chetan", 9.20));
        // list.add(new Student("Prafulla", 9.40));
        // list.add(new Student("Dipak", 8.40));
        // list.add(new Student("Nikhil", 9.20));

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(15,26,68,69,12,22));

        // list.sort(null); cause Student class does not have any natural sorting order
        // so that why comaparable has been introduced for giving user defined class a
        // natural sorting order.

        // Comparator --> Work on two object and used for custom sorting logic.
        // It has method compare(T o1, T o2) --> ex: compare(Student_1, Student_2)

        // Comparable --> work on user defined class to give them natural sorting logic.
        // It has compareTo(T o1) method --> ex : Student_1.compareTo(Student_2)

        System.out.println(list);


        // Student student = new Student("chetan", 9.40);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Chetan", 9.24));
        students.add(new Student("Prafulla", 9.40));
        students.add(new Student("Dipak", 8.24));
        students.add(new Student("Nikhil", 9.24));

        System.out.println(students);
    }
}

class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // @Override
    // public String toString() {
    //     return "Student [Name : " + name + ", GPA : " + gpa + " ]";
    // // }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGpa(), this.getGpa());
        // return 0;
    }
}
