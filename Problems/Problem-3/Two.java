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
    public static void main(String[] args) {
        triangle(4);
        triangle(9);
    }
}

/*
11. Print a triangle pattern of stars.
12. Print a pyramid number pattern.
13. Print a hollow square pattern.
14. Print Floyd’s triangle.
15. Print Pascal's triangle.
 */
