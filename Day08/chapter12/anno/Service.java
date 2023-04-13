package ex08.chapter12.anno;

public class Service {
  // @PrintAnnotation("+"), @PrintAnnotation(number=20), @PrintAnnotation(value= "+", number = 20)
  @PrintAnnotation(value= "*", number = 20)
  public void method1() {
    System.out.println("method1 이 실행됩니다.");
  }
  @PrintAnnotation
  public void method2() {
    System.out.println("method2 가 실행됩니다.");
  }
  @PrintAnnotation(value= "+")
  public void method3() {
    System.out.println("method3 이 실행됩니다.");
  }

}
