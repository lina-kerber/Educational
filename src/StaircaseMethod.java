public class StaircaseMethod {
    public static void main(String[] args) {
        staircase(4);
    }

    public static void staircase(int n) {
        for (int k = n - 1; k >= 0; k--) {
            for (int i = 0; i < k; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < n - k; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
