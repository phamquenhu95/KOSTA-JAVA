package ex4.exercise;

public class Circle {
  public int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public void show() {
    System.out.println("반지름이 " + radius + "인 원이다.");
  }
}


class ColoredCircle extends Circle {
  String color;

  public ColoredCircle(int radius, String color) {
    super(radius); // 생성자 늘 맨 위에
    this.color = color;
  }

  @Override
  public String toString() {
    return "반지름이 " + radius + "인 " + color +" 원이다.";
  }

  //
//  @Override
//  public void show() {
//    System.out.println("반지름이 " + radius + "인 " + color +" 원이다.");
//  }
}



