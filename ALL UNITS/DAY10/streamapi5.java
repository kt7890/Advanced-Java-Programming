// import java.util.*;

// public class streamapi5 {
//     public static void main(String[] args) {

//         List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

//         int product = list.stream().reduce(1, (a, b) -> a * b);

//         System.out.println("Product = " + product);
//     }
// }


// import java.util.*;

// public class streamapi5 {
//     public static void main(String[] args) {

//         List<Integer> list = Arrays.asList(10, 25, 5, 40, 15);

//         int max = list.stream().reduce((a, b) -> a > b ? a : b).get();

//         System.out.println("Maximum = " + max);
//     }
// }


// import java.util.*;

// public class streamapi5 {
//     public static void main(String[] args) {

//         List<Integer> list = Arrays.asList(10, 25, 5, 40, 15);

//         int max = list.stream().reduce((a, b) -> a > b ? a : b).get();

//         System.out.println("Maximum = " + max);
//     }
// }


// import java.util.*;

// public class streamapi5 {
//     public static void main(String[] args) {

//         List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

//         int sumEven = list.stream().filter(n -> n % 2 == 0).reduce(0, (a, b) -> a + b);

//         System.out.println("Sum of even numbers = " + sumEven);
//     }
// }


import java.util.*;

public class streamapi5 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "C", "Python", "Go", "Spring");

        int totalLength = list.stream().filter(s -> s.length() > 3).map(String::length).reduce(0, Integer::sum);

        System.out.println("Total length = " + totalLength);
    }
}