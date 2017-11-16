import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] intsWithFixedSize = new int[5];

        int[] intsWithElements = new int[]{1, 2, 5, 2, 3};

        System.out.println(intsWithFixedSize[2]);
        System.out.println(intsWithElements[2]);

//        System.out.println(intsWithElements[5]); Out of Bounds. Don't do it, 'kay?

        intsWithFixedSize[0] = -2;
        System.out.println(intsWithFixedSize[0]);

        System.out.println(intsWithElements.length);

//        System.out.println(intsWithElements); Doesn't work. Please use next line

        System.out.println(Arrays.toString(intsWithElements));

        char[] chars = new char[]{'1', '2', 'a', '!'};
        String[] strings = new String[]{"abc", "cde", "", "HDOORODOR"};
        int[][] matrixFixedSize = new int[5][5];
        int[][] matrixWithElements = new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}};
        System.out.println(matrixWithElements[2][1]);

        int[][][][][] fifthDimensionalMatrix = new int[5][5][5][5][5];
        System.out.println(fifthDimensionalMatrix[1][0][2][3][4]);


        System.out.println("FOR EXAMPLE");
        for (int i = 0; i < intsWithElements.length; i++) {
            System.out.println(intsWithElements[i] * 2);
        }

        System.out.println("FOR EACH EXAMPLE");
        for (int someInt : intsWithElements) {
            System.out.println(someInt * 2);
        }
        int[] intsWithElementsSimple = {1, 2, 5, 2, 3};
        int[][] matrixSimple = {{1, 2}, {3, 4}};
        String[] stringsSimple = {"String", "Wow"};

        int[][] squareMatrix = {{1, 2}, {3, 4}};
        int[][] rectangleMatrix = {{1, 2}, {3, 4}, {5, 6}};
        int[][] notMatrix = {{1}, {2, 3}, {4, 5, 6}};

        System.out.println(Arrays.toString(intsWithElementsSimple));
        System.out.println(Arrays.deepToString(notMatrix));
    }
}
