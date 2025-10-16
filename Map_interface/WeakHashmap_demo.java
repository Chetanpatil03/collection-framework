package Map_interface;

import java.util.WeakHashMap;

public class WeakHashmap_demo {

    public static void main(String[] args) {
        WeakHashMap<String,Image> hashMap = new WeakHashMap<>();
        hashMap.put(new String("Chetan"), new Image("Image one"));
        hashMap.put(new String("Prafful"), new Image("Image three"));
        hashMap.put(new String("Dipak"), new Image("Image two"));

        System.out.println(hashMap);
        System.gc();
        someRandomShit();
        someRandomShit();

        System.out.println(hashMap);
    
    }

    public static void someRandomShit(){
        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }


}

class Image{

    private String name;
    Image(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}