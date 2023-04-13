package ex5.sec02;

public class Computer implements Controllable{
  // controllable 구현, on, off, repair 기능 구현

  @Override
  public void turnOn() {
    System.out.println("컴퓨터를 켠다.");
  }

  @Override
  public void turnOff() {
    System.out.println("컴퓨터를 끈다.");
  }

  @Override
  public void repair() {
    System.out.println("컴퓨터를 수리한다.");
  }
}
