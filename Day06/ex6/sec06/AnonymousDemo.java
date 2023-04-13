package ex6.sec06;

public class AnonymousDemo {
  Bird e = new Bird() {
    @Override
    public void move() {
      System.out.println("독수리가 난다.");
    }
    @Override
    public void sound() {
      System.out.println("휘익.");
    }
  };

  public static void main(String[] args) {
    AnonymousDemo a = new AnonymousDemo();
    a.e.move();
//    a.e.sound();
  }
}
