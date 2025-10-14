package Map_interface;
import java.util.HashMap;
import java.util.Objects;

public class HashCode_equals {
    public static void main(String[] args) {
        HashMap<String,Integer > studentMap = new HashMap<>();
        studentMap.put("Chetan", 90); //hashcode 1 --> index 1
        studentMap.put("Prafulla", 80); //hashcode 2 --> index 2
        studentMap.put("Chetan", 90); //hashcode 1 --> index 1 -->equals --> replace value
        
        
        HashMap<Person,String> map = new HashMap<>();
        
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 1);
        Person p3 = new Person("Alice", 1);

        // adding to hashmap
 
        // map.put(p1, "Engineer");  //hashcode1 ---> index1 -- differ from p3
        // map.put(p2, "Designer");  //hashcode2 ---> index2
        // map.put(p3, "Manager");   //hashcode3 ---> index3 -- differ from p1

        // solution for this is overriding the hashcode and equals method
        
        
        map.put(p1, "Engineer");  //hashcode1 ---> index1
        map.put(p2, "Designer");  //hashcode2 ---> index2
        map.put(p3, "Manager");   //hashcode1 ---> index1 -- same to one
        
        System.out.println("Hashmap size : "+map.size()); 
        System.out.println("Value of p1 : "+map.get(p1)); //hashcode1 --> index1
        System.out.println("Value of p3 : "+map.get(p3)); //hashcode1 --> index1 

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if(getClass() == obj.getClass()){
            return true;
        }
        Person other = (Person) obj;
        return other.getId() == id && Objects.equals(name,other.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,id);
    }

    @Override
    public String toString() {
        return "id : "+id + ", Name : "+name;
    }
}
