interface inter {
    default void show() {
        System.out.println("Default method in interface");
    }
}

public class def implements inter {

    public static void main(String[] args) {
        def d = new def();
        d.show();
    }
}
