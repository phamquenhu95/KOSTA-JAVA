package ex5.sec04;

public class MovableDemo {
  public static void main(String[] args) {
    Movable m = new Car(); // upcasting 자동으로
    m.move(5);
//    m.show();

    Car car = (Car)m;
    car.move(5);
    car.show();
  }
}
