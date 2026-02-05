public class SecondLarge {
    public static void main(String[] args) {
        int [] arr = {25,69,95,5,9,6,6,85,9,6,5,9,5,5,6,56};
        System.out.println("Second large element :: "+secondLarge(arr));        
    }

    public static int secondLarge(int [] arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max) {
                secMax = max;
                max = i;
            }
            else if ( i > secMax && i != max) {
                secMax = i;
            }
        }

        return secMax;

    }
}
