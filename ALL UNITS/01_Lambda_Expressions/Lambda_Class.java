interface Test {
    void show();
}

public class Lambda_Class {
    public static void main(String[] args) {
        Test t = () -> System.out.println("Hello World");
        t.show();
    }
}

