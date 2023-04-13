package ex4.exercise02;

public class Point {
  private int x, y;


  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public String toString() {
    return "Point{" + "x=" + x + ", y=" + y + "}";
  }
}

class MovablePoint extends Point {

  private int xSpeed, ySpeed;


  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;

  }

  public int getXSpeed() {
    return xSpeed;
  }

  public int getYSpeed() {
    return ySpeed;
  }

  @Override
  public String toString() {
    return "MovablePoint{x=" + getX()+ ", y=" + getY()+", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + " }";
  }

}

//class MovablePoint {
//  Point sPoint; // start Point
//  Point ePoint; // end Point
//}
