import java.util.ArrayList;
import java.util.List;

public class foreachmethod {
  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>();
    l.add(34);
    l.add(67);
    l.add(10);
    l.add(45);
    l.add(56);
    l.add(69);
    l.forEach(i -> System.out.println(i));

    System.out.println(" ");

    l.forEach(i -> {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    });

    System.out.println(" ");

    List<String> l2 = new ArrayList<>();
    l2.add("KP");
    l2.add("PK");
    l2.forEach(s -> System.out.println(s + "!"));

    System.out.println(" ");

     List<String> l3 = new ArrayList<>();
        l3.add("kp");
        l3.add("pk");
        l3.add("java");
        l3.add("lambda");

        l3.forEach(s -> System.out.println(s.toUpperCase()));


        
  }
}
