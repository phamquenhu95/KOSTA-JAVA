package ex5.sec02;

public class TV implements Controllable{
  // 수리기능 구현
  @Override
  public void turnOn() {
    System.out.println("TV를 켠다.");
  }

  @Override
  public void turnOff() {
    System.out.println("TV를 끈다.");
  }

  @Override
  public void repair() {
    System.out.println("TV를 수리한다.");
  }
}
