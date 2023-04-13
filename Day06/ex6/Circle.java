package ex6;

public class Circle {
  public double radius;

  public Circle(double radius) {
    this.radius = radius;
  }
  public double getArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public String toString() {
    return "Circle{" + "radius=" + radius + "}";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Circle) {
      Circle c = (Circle) obj;
      if (c.getArea() == getArea()) {
        return true;
      }
    }
    return false;
  }
}


