class Test {

    int x = 23;   

    Test() {     
        System.out.println("constructor value " + x);
    }

    void check() {   
        String s = "Hello";
        System.out.println(s);
    }
}

public class localvariable {

    public static void main(String[] args) {

        Test t = new Test();  
        t.check();

        for (int i = 0; i <= 4; i++) {
            System.out.println(i);
        }
    }
}
