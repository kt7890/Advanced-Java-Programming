import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class streamapi {
    public static void main(String[] args) {

        int arr[] = {3, 4, 7, 89, 43, 80};

        Arrays.stream(arr).forEach(System.out::println);

        Stream.of(2, 6, 45, 34).forEach(System.out::println);

        List<Integer> l3 = new ArrayList<>();
        l3.add(500);
        l3.add(1000);
        l3.add(800);
        l3.add(900);

        // create new stream and store result
        List<Integer> evenList = l3.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        // print result
        evenList.forEach(System.out::println);
    }
}