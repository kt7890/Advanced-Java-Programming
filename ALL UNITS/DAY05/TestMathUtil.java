interface MathUtil {

    static int add(int a, int b) {
        return a + b;
    }

    static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    static void checkEvenOdd(int n) {
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

public class TestMathUtil {

    public static void main(String[] args) {

        System.out.println(MathUtil.add(10, 20));
        System.out.println(MathUtil.max(10, 20));
        MathUtil.checkEvenOdd(7);
    }
}
