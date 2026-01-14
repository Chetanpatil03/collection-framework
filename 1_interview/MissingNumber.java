public class MissingNumber {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,8,9};
        int n = 9;
        int sum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int i : arr) {
            actualSum += i;
        }

        System.out.println("Missing number :: "+(sum - actualSum));
    }
}
