package ex5.sec02;

/**
 * turnOn(), turnOff() 빈드시 구현해야함
 * repair() 는 필요한 경우 구현
 * @param 은 없음
 */
public interface Controllable {
  void turnOn();
  void turnOff();
  default void repair() {
    System.out.println("장비를 수리한다.");
  }
  static void reset () {
    System.out.println("장비를 초기화한다.");
  }
}
