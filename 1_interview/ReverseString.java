public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello world";

        System.out.println("Reverse :: "+revString(str));
        System.out.println("Reverse :: "+reverse(str));
        System.out.println("Reverse :: "+revString(str.toCharArray()));
        
        System.out.println("Reversed word [ Hello my name is chetan ]:: "+reverseWords("Hello my name is chetan"));
    }

    public static String revString(String string){
        String rev = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            rev += string.charAt(i);
        }
        return rev;
    }

    public static String reverse(String str){
        return new StringBuffer(str).reverse().toString();
    }

    public static String revString(char [] arr){

        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        return new String(arr);
    }

    public static String reverseWords(String string){
        String [] arr = string.split("\\s");
        String revString = "";
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            revString += arr[i] + " ";
        }

        return revString;
    }
}
