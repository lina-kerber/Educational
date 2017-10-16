public class ControlFlow {
    public static void main(String[] args) {
            boolean bool = 52 % 3 == 0;
        if (bool) {
            System.out.println(4);
        } else {
            System.out.println(3);
        }

        if (73 / 42 == 1) {
            System.out.println("YES");
        }

        int i = 5;
        if (i > 0) {
            System.out.println("More than zero");
        } else if (i < 0) {
            System.out.println("Less than zero");
        } else {
            System.out.println("Equals zero");
        }

        while (i < 0) {
            System.out.println("Yay");
//            i--;
        }

        do {
            System.out.println("Yay");
//            i--;
        } while (i < 0);


        for (int j = 0; j < 5; j+= 2) {
            System.out.println(i);
        }

        //for each
        //switch case
    }
}
