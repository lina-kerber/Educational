import java.util.ArrayList;

public class StringFilter {
    public static void main(String[] arg) {
        String[] strings = {"125", "25488s", "4582", "ff", "gfg55", "4582gfg"};
        System.out.println(filter(strings));
    }

    private static ArrayList<String> filter(String[] strings) {
        ArrayList<String> result = new ArrayList<>();
        for (String temp : strings) {
            if (temp.length() > 5) {
                result.add(temp);
            }
        }
        return result;
    }
}
