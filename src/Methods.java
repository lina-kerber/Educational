public class Methods {
    public static void main(String[] args) {
        int i = 5;
        int j = multiplyByTwo(i);
        System.out.println(j);
        System.out.println(sumOfSquares(5, 7));
        System.out.println(aggressive("something"));
        doShit();
    }

    public static int multiplyByTwo(int n) {
        return n * 2;
    }

    public static int sumOfSquares(int first, int second) {
        return first * first + second * second;
    }

    public static String aggressive(String name) {
        return name.toUpperCase();
    }

    public static void doShit() {
        System.out.println("LALALALALAL");
        System.out.println("HAHAHAHHAHAA");
    }
}
