public class StarPattern {
    public static void main(String[] args) {
        // System.out.println();
        // simpleSquare(5);
        // triangle(5);
        // ReverseTriangle(5);
        triangleReverse(5);
    }

    public static void simpleSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void ReverseTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j= n; j > 0; j--) {
                if (j <= i) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void triangleReverse(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}