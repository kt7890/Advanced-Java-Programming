interface sell{
    String display(String s);
}
public class MethodReference{
    public static void main(String args[]){
        sell ref=String::toUpperCase;
       System.out.println( ref.display("ISAAAAAAAAAAAABEL"));

    }
}