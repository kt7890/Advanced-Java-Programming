interface def2 {
    default void def1() {
        System.out.println("Default method interface - def2");
    }
}

interface inter2 {
    default void def1() {
        System.out.println("Default method interface - inter2");
    }
}

public class def3 implements def2, inter2 {

    // Mandatory override due to default method conflict
    public void def1() {
        def2.super.def1();
        inter2.super.def1();
    }

    public static void main(String[] args) {
        def3 d = new def3();
        d.def1();
    }
}
