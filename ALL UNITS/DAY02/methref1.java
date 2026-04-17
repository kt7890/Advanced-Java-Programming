interface int1{
  void show();
}
class Demo{
  public void display(){
    System.out.println("reference to static method");
  }
}
public class methref1{
public static void main(String[] args) {
    Demo d = new Demo();
    int1 i1=d::display;
    i1.show();
}
}