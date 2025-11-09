package Java_8;

public class LambdaDemo {
    public static void main(String[] args) {
        // ex. 1 :  thread object creation 

        Thread thread = new Thread(() -> { System.out.println("Hello from thread"); });
        thread.start();

        MathOperations sum = (a,b) -> a + b;
        MathOperations sub = (a,b) -> a - b;
        MathOperations mult = (a,b) -> a * b;

        int res = sum.operate(14, 19);
        System.out.println("Sum : "+res);
        System.out.println("SUb : "+sub.operate(14, 5));
        System.out.println("Multiplication  : "+mult.operate(14, 5));


    }
}

interface MathOperations{
    public abstract int operate(int a, int b);
}