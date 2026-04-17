import java.util.*;

public class Remontada {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 9, 4, 7, 1);

        int total = list.stream()
                        .reduce(0, (a, b) -> a + 1, Integer::sum);

        System.out.println("Total elements = " + total);
    }
}