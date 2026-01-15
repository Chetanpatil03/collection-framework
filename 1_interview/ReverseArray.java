public class ReverseArray {
    public static void main(String[] args) {
        int []arr = {15,9,82,6,81,5,24,95,56,75,85,42,64};

        System.out.print("Array Elements :: ");
        for (int i : arr) 
            System.out.print(i+" ");

        System.out.print("\nReversed       :: ");
        for (int i : revereseArray(arr)) 
            System.out.print(i+" ");
    }

    public static int[] revereseArray(int []arr){
        int n = arr.length;
        for (int i = 0; i < n /2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        return arr;
    }
}
