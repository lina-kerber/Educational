public class PrimitiveTutorial {
    public static void main(String[] args) {
        int i = 52;
        System.out.println(i * 2);

        System.out.println(i % 3 == 0);

        char c = 'a';
        System.out.println(c);

        System.out.println(c == 'b');

        boolean result = i % 3 == 0;
        System.out.println(!result);

        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(!true);
        System.out.println(true ^ false);

        double d = 115.114;
        System.out.println(d * d);
    }
}
