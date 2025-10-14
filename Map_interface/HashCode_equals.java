import java.util.HashMap;

public class HashCode_equals {
    public static void main(String[] args) {
        HashMap<Person,String> map = new HashMap<>();
        
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 1);
        Person p3 = new Person("Alice", 1);

        // adding to hashmap
 
        map.put(p1, "Engineer");  //hashcode ---> index -- differ from p3
        map.put(p2, "Designer");  //hashcode ---> index
        map.put(p3, "Manager");   //hashcode ---> index -- differ from p1
    }
}

class Person{
    String name;
    int id;
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
