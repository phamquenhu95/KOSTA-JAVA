package ex5.sec01;

public abstract class Shape {
  double pi = 3.14;

  abstract void draw();
  public double findArea() {
    return 0.0;
  }
}

  class Circle extends Shape {
    int radius;

    public Circle(int radius) {
      this.radius = radius;
    }

    @Override
    void draw() {
      System.out.println("원을 그린다.");
    }

    @Override
    public double findArea() {
      return pi * radius * radius;
    }
  }

  class Retangle extends Shape {
  int width, height;

    public Retangle(int width, int height) {
      this.width = width;
      this.height = height;
    }

    @Override
    void draw() {
      System.out.println("사작형을 그린다.");
    }

    @Override
    public double findArea() {
      return (double)(width * height);
    }
  }
