package ex5.sec01;

public class ShapeDemo {
  public static void main(String[] args) {
//    Shape shape = new Shape();
  Circle circle = new Circle(3);
    circle.draw();
    System.out.printf("원의 넓이는 %.1f \n ", circle.findArea());
  Shape shape = new Circle(3);

  Retangle retangle = new Retangle(3,4);
  retangle.draw();
    System.out.println("사작형의 넓이는 : " + retangle.findArea());
  }
}
