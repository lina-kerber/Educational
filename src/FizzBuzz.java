public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fb(25));
    }

    private static int fb(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz = " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz = " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz = " + i);
            } else {
                System.out.println("not = " + i);
            }
        } return n;
    }
}