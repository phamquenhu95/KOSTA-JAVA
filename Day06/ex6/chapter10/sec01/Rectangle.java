package ex6.chapter10.sec01;

public class Rectangle implements Comparable<Rectangle> {
  private int width, height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }
  public int getArea() {
    return width * height;
  }

  @Override
  public String toString() {
    return String.format("사각형[넓이 = %d, 높이 = %d] ", width, height);
  }

  @Override
  public int compareTo(Rectangle o) {

    return getArea() - o.getArea();
  }
}
