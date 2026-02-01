public class NumberPatterns {

    public static void main(String[] args) {
        normalSquare(3);
    }

    public static void normalSquare(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}