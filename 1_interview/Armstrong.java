public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Number is Armstrong :: "+isArmstrong(153));
        System.out.println("Number is Armstrong :: "+isArmstrong(121));
    }

    public static int cube(int n){
        return n*n*n;
    }

    public static boolean isArmstrong(int num){
        int og = num;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += cube(rem);
            num /= 10;
        }

        return og == sum;
    }
}
