import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 9, 4, 7, 1);

        int max = list.stream().reduce(Integer.MIN_VALUE, Integer::max);

        System.out.println("Max = " + max);
    }
}