
interface Calculator {
  int calculate(int x, int y);
}

public class lambda2 {
  public static void main(String[] args) {
      Calculator add = (a, b)->{return a+b;};
      Calculator sub = (a, b)->a-b;
      Calculator mul = (a, b)->a*b;
      Calculator div = (a, b)->a/b;
      
      System.err.println("Addition = "+add.calculate(5, 10));
      System.err.println("Subtract = "+sub.calculate(5, 10));
      System.err.println("Multipliction = "+mul.calculate(5, 10));
      System.err.println("Division = "+div.calculate(5, 10));
  }
}