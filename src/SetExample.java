import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("123"); //add element
        System.out.println(stringSet.size());
        stringSet.add("asd");
        stringSet.add("123");
        System.out.println(stringSet.size());
        stringSet.remove("123");
        System.out.println(stringSet.size());
        System.out.println(stringSet.contains("asd"));
        System.out.println(stringSet);

        HashSet<Character> charSet = new HashSet<>();
        charSet.add('c');
        charSet.add('a');
        charSet.add('a');
        System.out.println(charSet.size());
        Character.isLetter('a');
        Character.toLowerCase('B');
        // char[] charArray = "asdqwe".toCharArray();
    }
}

