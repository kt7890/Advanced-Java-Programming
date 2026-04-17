class Student{
int id;
String name;
Student(){
  System.out.println("no-arguement constructor");
}
}
public class construct {
  public static void main(String[] args) {
    Student s1 = new Student();
    System.out.println(s1.id);
  }
}
