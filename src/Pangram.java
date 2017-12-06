import java.util.HashSet;

public class Pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(letter(str));
    }

    private static boolean letter(String str) {
        boolean result = (true);
        HashSet<Character> ch = new HashSet<>();
        for (char c : str.toLowerCase().toCharArray()) {
            if (!ch.contains(c) && Character.isLetter(c) || Character.isWhitespace(c)) {
                ch.add(c);
                result = ch.size() == 27;

            } else if (!ch.contains(c) && !Character.isLetter(c)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
