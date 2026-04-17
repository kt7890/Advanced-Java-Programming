import java.util.*;

public class SortDescending {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(5);
        list.add(30);
        list.add(20);
        list.add(15);

        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });

        System.out.println("Sorted list in descending order: " + list);
    }
}