package ex2;

public class CompLogicDemo {
  public static void main(String[] args) {
    int x = 0, y = 1;

    System.out.println( (y < 1) && (x < 1) ); // false && true -> false
    // System.out.println( (y < 1) || (x < 1) ); // false || true -> true
    System.out.println( (x < 1) || (y < 1) ); //   true  || false -> true


  }
}
