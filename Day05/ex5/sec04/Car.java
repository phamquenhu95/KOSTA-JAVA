package ex5.sec04;

public class Car implements Movable {
  private int pos;
  @Override
  public void move(int x) {
    pos += x;
  }
  public void show() {
    System.out.println(pos + " m 만큼 자동차가 이동한다.");
  }
}
