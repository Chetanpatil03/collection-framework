public class Pallindrom {
    public static void main(String[] args) {
        System.out.println("Is pallindrom :: "+isPallindrom(121));
        System.out.println("Is pallindrom :: "+isPallindrom(12));
    }

    public static boolean isPallindrom(int num){
        int og = num;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        return rev == og;
    }
}
