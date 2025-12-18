public class Two {

    // 11. Print a triangle pattern of stars.
    public static void triangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 12. Print a pyramid number pattern.
    public static void pyramidNumber(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print(k+1+" ");
            }
            System.out.println();
        }
    }

    public static void pyramidStars(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    // 13. Print a hollow square pattern.
    public static void hollowSquare(int n){
        int start = 1, end = n;
        for (int i = 1; i <= end; i++) {
            for (int j = 1; j <=end; j++) {
                if (j == start || j== end || i == start || i == end)
                    System.out.print(" * ");
                else 
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    // 14. Print Floyd’s triangle.
    public static void floyTriangle(int n){
        int curr = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(curr+"  ");
                curr++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangle(4);
        System.out.println("*****************************\n");
        pyramidNumber(5);
        System.out.println("*****************************\n");
        pyramidStars(5);

        System.out.println("*****************************\n");
        hollowSquare(5);
        System.out.println("*****************************\n");

        floyTriangle(4);
    }
}

/*
11. Print a triangle pattern of stars.
12. Print a pyramid number pattern.
13. Print a hollow square pattern.
14. Print Floyd’s triangle.
15. Print Pascal's triangle.
 */
