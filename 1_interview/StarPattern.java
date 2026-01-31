public class StarPattern {
    public static void main(String[] args) {
        // System.out.println();
        simpleSquare(5);
    }

    public static void simpleSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}