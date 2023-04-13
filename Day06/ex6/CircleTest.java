package ex6;

public class CircleTest {
  public static void main(String[] args) {
    Circle circle = new Circle(10);
    Circle circle1 = new Circle(10);
//    Human human = new Worker();
    Circle circle2 = new Circle(1);
    String name = "abc";

    System.out.println(circle1.equals(circle));
    System.out.println(circle1.equals(circle2));
    System.out.println(circle1);
    System.out.println(circle);
    System.out.println(circle1.equals(null));
    System.out.println(circle1.equals(name));
  }
}
