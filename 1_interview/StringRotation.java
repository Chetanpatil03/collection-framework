
public class StringRotation{
    static public void main(String[] args) {
        // System.out.println("Hello world!");
        System.out.println("Is Rotation :: "+ isRotationString("waterbottle", "terbottlewa"));    
        System.out.println("Is Rotation :: "+ isRotationString("mango", "goman"));    
    }

    public static boolean isRotationString(String s1, String s2){
        if (s1 == null || s2 == null) return false;
        if (s1.length() != s2.length()) return false;
        
        return (s1 + s2).contains(s2);
    }
}

/*
    Problem: Determine if s2 is a rotation of s1. (e.g., erbottlewat is rotation of waterbottle)
*/
