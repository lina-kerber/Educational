import java.util.HashSet;

public class Pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        System.out.println(isPangram(str));
    }

    private static boolean isPangram(String str) {
        boolean result = true;
        HashSet<Character> ch = new HashSet<>();
        for (char c : str.toLowerCase().toCharArray()) {
            if (!ch.contains(c) && Character.isLetter(c)) {
                ch.add(c);
                result = ch.size() == 26;
            }
        }
        return result;
    }
}
