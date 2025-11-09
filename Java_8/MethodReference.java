package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {

    public static void main(String[] args) {
        // method reference
        // replacement for lambda expression making it more easier
        // use method without involving and in place of lambda expression

        // ex : forEach

        List<String> students = Arrays.asList("Chetan","Prafulla","Dipak","Prakash");
        // lambda : 
        students.forEach(x-> System.out.println(x));
        // method reference
        students.forEach(System.out::println);

        // constructor reference
        // want to create a list of Students with using names that are present in students list
        // using streams

        List<Student> names = students.stream().map(Student::new).collect(Collectors.toList());
        names.forEach(System.out::println);
    


    }
}

class Student{
    String name;
    public Student(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "[ Name : "+name + " ],";
    }
}