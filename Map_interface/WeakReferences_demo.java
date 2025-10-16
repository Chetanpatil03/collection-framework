package Map_interface;

import java.lang.ref.WeakReference;

public class WeakReferences_demo {

    public static void main(String[] args) {
        WeakReference<Phone>  weakReferences = new WeakReference(new Phone("Iphone", "16 pro max"));

        System.out.println(weakReferences.get());

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(weakReferences.get());
    }
}

class Phone{
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone [brand=" + brand + ", model=" + model + "]";
    }

    

    
}