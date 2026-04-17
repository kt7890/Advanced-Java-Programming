// // import java.util.*;    //1

// // class Student {
// //     String name;
// //     int age;

// //     Student(String name, int age) {
// //         this.name = name;
// //         this.age = age;
// //     }
// // }

// // public class Main {
// //     public static void main(String[] args) {
// //         List<Student> students = Arrays.asList(
// //             new Student("Rahul", 20),
// //             new Student("Aman", 21),
// //             new Student("Neha", 19)
// //         );

// //         List<String> names = students.stream()
// //                                      .map(s -> s.name)
// //                                      .toList();

// //         System.out.println(names);
// //     }
// // }



// import java.util.*;   //2

// class Student {
//     String name;
//     int marks;

//     Student(String name, int marks) {
//         this.name = name;
//         this.marks = marks;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         List<Student> students = Arrays.asList(
//             new Student("Rahul", 45),
//             new Student("Aman", 72),
//             new Student("Neha", 88),
//             new Student("Riya", 39)
//         );

//         students.stream()
//                 .filter(s -> s.marks > 50)
//                 .forEach(s -> System.out.println(s.name + " " + s.marks));
//     }
// }


// import java.util.*;   //3

// public class Main {
//     public static void main(String[] args) {
//         List<Integer> list = Arrays.asList(-5, 3, 0, 7, -2, 2, 9, 1);

//         List<Integer> result = list.stream()
//                                    .filter(x -> x > 2)
//                                    .toList();

//         System.out.println(result);
//     }
// }

// import java.util.*;   //4

// public class Main {
//     public static void main(String[] args) {
//         List<String> list = Arrays.asList("Apple", "Mango", "Aman", "Banana", "Ankit");

//         List<String> result = list.stream()
//                                   .filter(s -> s.startsWith("A"))
//                                   .toList();

//         System.out.println(result);
//     }
// }



// import java.util.*;   //5

// public class Main {
//     public static void main(String[] args) {
//         List<String> list = Arrays.asList("Anna", "Mango", "Asha", "Banana", "Lila");

//         List<String> result = list.stream()
//                                   .filter(s -> s.endsWith("a") || s.endsWith("A"))
//                                   .toList();

//         System.out.println(result);
//     }
// }


// import java.util.*; //6

// public class Main {
//     public static void main(String[] args) {
//         List<Integer> list = Arrays.asList(-5, 3, 0, 7, -2, 2, 9, 1);

//         List<Integer> result = list.stream()
//                                    .filter(x -> x > 0)
//                                    .toList();

//         System.out.println(result);
//     }
// }

// import java.util.Arrays;  //7//
// import java.util.List;

// public class Main{
//     public static void main(String[] args) {
//         List<Integer> list = Arrays.asList(4, 5, 6, 6, 10, 600, 56,43);
//         List<Integer> result = list.stream()
//         .filter(x -> x % 2 != 0)
//         .toList();
//         System.out.println(result);
//     }
// }


// import java.util.*;   //8

// public class Main {
//     public static void main(String[] args) {
//         List<String> list = Arrays.asList("Apple", "Mango", "Cat", "Ball", "Ant");

//         List<String> result = list.stream()
//                                   .filter(s -> s.contains("A") || s.contains("a"))
//                                   .toList();

//         System.out.println(result);
//     }
// }

import java.util.*;   //9

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Mangoes", "Banana", "Cat", "Orange");

        List<String> result = list.stream()
                                  .filter(s -> s.length() > 5)
                                  .toList();

        System.out.println(result);
    }
}

