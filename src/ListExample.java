import java.util.ArrayList;
import java.util.Arrays;

public class ListExample {
    public static void main(String[] arg) {
        ArrayList<String> list = new ArrayList<>();
        list.add("4564");
        list.add("Something");
        list.add("fgdfg");
        System.out.println(list.get(0));
        // System.out.println(list.get(4)); IndexOutOfBounds
        // System.out.println(list.get(-1)); IndexOutOfBounds
        list.set(2, "qwpqpe");

        "abfx".length();
        String string = "abfdqweq";
        string.length();
        list.get(0).length();

        list.size();
        System.out.println(list.size());

        System.out.println(list);

        ArrayList<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(new int[]{1, 3, 2});
        listOfArrays.add(new int[]{3, 2, 5});
        System.out.println(listOfArrays);

        for (int i = 0; i < 2; i++) {
            System.out.println(list.get(i));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String someString : list) {
            System.out.println(someString);
        }

        for (int[] intArray : listOfArrays) {
            System.out.println(Arrays.toString(intArray));
        }

        list.remove("4564");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}

