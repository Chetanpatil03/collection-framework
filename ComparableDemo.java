public class ComparableDemo {
    public static void main(String[] args) {
        
    }
}

class Student implements Comparable<Student>{
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

    @Override
    public String toString() {
        return "Student [Name : "+name+", GPA : "+gpa+" ]";
    }


    @Override
    public int compareTo(Student o) {
        return 1;
    }



    

}
