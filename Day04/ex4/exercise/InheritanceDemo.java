package ex4.exercise;

public class InheritanceDemo {
  public static void main(String[] args) {
    Circle c = new Circle(10);
    c.show();

    ColoredCircle c1 = new ColoredCircle(10, "red");
//    c2.show();

    System.out.println(c1);

  }
}
