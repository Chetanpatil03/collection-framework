import java.util.Arrays;

public class Sorting {
    // Source - https://stackoverflow.com/a/28785614
    // Posted by Yoga, modified by community. See post 'Timeline' for change history
    // Retrieved 2026-02-04, License - CC BY-SA 3.0

    public static void main(String[] args) {
        int[] arr = { 6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74 };
        // selectionSort2(arr);
        bubbleSort(arr);
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        System.out.println("Array :: "+Arrays.toString(arr));
    }
    
    public static void selectionSort2(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array :: "+Arrays.toString(arr));
    }
    
    
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Array :: "+Arrays.toString(arr));
    }
    
}
