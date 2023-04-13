package ex5.sec02;

public class Controllable2Demo {
  public static void main(String[] args) {
    Controllable[] controllables = new Controllable[3];
    // {new TV()....
    controllables[0] = new TV();
    controllables[1] = new Computer();
    controllables[2] = new Notebook();

    for (Controllable controllable : controllables) {
      controllable.turnOn();
      controllable.turnOff();
      controllable.repair();
//      controllable.inMyBag(); // 안됨
    }
    Controllable.reset();
  }
}
