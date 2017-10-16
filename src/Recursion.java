public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int n) {
        System.out.println("Current number: " + n);
        if (n == 1) {
            return 1;
        } else {
            int result = n * factorial(n - 1);
            System.out.println("Current result: " + result);
            return result;
        }
    }
}
