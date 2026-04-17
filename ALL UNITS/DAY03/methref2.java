interface method{
    Student get();
}
class Student{
    Student(){
        System.out.println("creating student");
    }
}
public class methref2{
    public static void main (String args[]){
        method m=Student::new;
       m.get();
    }
}