package DAY08;

@FunctionalInterface
interface CompareNumbers {
    int max(int a, int b);
}

public class Test {
    public static void main(String[] args) {

    
        CompareNumbers obj = (x, y) -> (x > y) ? x : y; //ternary

        int result = obj.max(10, 20);

        System.out.println("Greater number is: " + result);
    }
}