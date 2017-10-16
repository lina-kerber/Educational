public class Fibonaccitwo {
    public static void main(String[] args) {
        int n = 30;
        int j = 1;
        int k = 1;
        System.out.println(j + k);
        int fib = 2, i = 2;
        while (i < n) {
            fib = j + k;
            j = k;
            k = fib;
            System.out.println(fib);
            i++;
        }
    }
}