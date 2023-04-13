package ex08.chapter12;

import java.util.OptionalDouble;

public class Optional1Demo {
  public static void main(String[] args) {
    System.out.println(divide(10.0, 0.0));
    System.out.println(divide(10.0,2.0));
    System.out.println(divide(10.0,2.0).getAsDouble()); //  getAsDouble = 5.0 꺼내서 출력
  }
  public static OptionalDouble divide(double x, double y) {
    return y == 0 ? OptionalDouble.empty() : OptionalDouble.of(x / y);
  }
}
