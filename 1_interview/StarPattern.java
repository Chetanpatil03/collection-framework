public class StarPattern {
    public static void main(String[] args) {
        // System.out.println();
        // simpleSquare(5);
        // triangle(5);
        // ReverseTriangle(5);
        // triangleReverse(5);
        // emptySquare(5);

        // triangleNumber(5);
        triangleNumberIncre(3);

    }

    public static void simpleSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void emptySquare(int n){
        
        int start = 1, end = n;

        for(int i = start; i<= end; i++){
            for (int j = start; j <= end; j++) {
                if (i == start || i == end || j == start || j == end) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
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

    public static void triangleNumber(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }

    public static void triangleNumberIncre(int n) {
        int c = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }

}