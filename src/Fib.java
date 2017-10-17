public class Fib {
    public static void main(String[] args) {
        System.out.println(fib(30));
    }

    private static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n < 0) {
            return -1;
        }
        int prev = 1;
        int fib = 1;
        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prev;
            prev = temp;
        }
        return fib;
    }

}