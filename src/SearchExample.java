public class SearchExample {
    public static void main(String[] args) {
        System.out.println(contains(4, new int[]{1, 2, 3, 4, 6}));
        System.out.println(indexOf(4, new int[]{1, 2, 3, 4, 6}));
    }

    private static int indexOf(int elem, int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == elem) {
                return i;
            }
        }
        return -1;
    }

    private static boolean contains(int elem, int[] ints) {
        for (int anInt : ints) {
            if (anInt == elem) {
                return true;
            }
        }
        return false;
    }


}
