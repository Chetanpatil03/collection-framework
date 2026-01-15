public class Pallindrom {
    public static void main(String[] args) {
        System.out.println("Is pallindrom :: "+isPallindrom(121));
        System.out.println("Is pallindrom :: "+isPallindrom(12));

        countDigits(121);
        reverseNumber(12365);
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

    public static void countDigits(int digit){
        int count = 0;
        while (digit != 0) {
            digit = digit / 10;
            count++;
        }

        System.out.println("Count :: "+count);
    }

    public static void reverseNumber(int number){
        int rev = 0;

        while (number != 0) {
            rev = rev * 10 + (number % 10);
            number /= 10;
        }
        System.out.println("Reverse number :: "+rev);
    }
}
