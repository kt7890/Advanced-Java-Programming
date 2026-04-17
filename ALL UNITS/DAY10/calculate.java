import java.util.*;

public class calculate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("cat", "apple", "bat", "mango", "sun", "tree");

        String result = list.stream()
                            .filter(s -> s.length() > 3)
                            .reduce("", (a, b) -> a + b);

        System.out.println("Concatenated String = " + result);
    }
}