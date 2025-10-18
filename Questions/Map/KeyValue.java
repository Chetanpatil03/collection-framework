package Map;

import java.util.HashMap;

public class KeyValue {
    HashMap<Integer,String> students = new HashMap<>();
    
    public static void addStudent(HashMap<Integer,String>map,int id,String name){
        map.put(id, name);
    }

    public static void main(String[] args) {
        
    }
}


