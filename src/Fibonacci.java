public class Fibonacci {
    public static void main(String[] args) {
            System.out.println(fib(30));
    }

    private static int fib(int j) {
        if (j == 0) {
            return 0;
       }else if (j == 1) {
            return 1;
        } else {
            return fib(j - 1) + fib(j - 2);
        }
    }
}