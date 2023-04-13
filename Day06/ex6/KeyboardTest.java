package ex6;

public class KeyboardTest {
  public static void main(String[] args) {
    Mouse mouse1 = new Mouse("mouse");
    Mouse mouse2 = new Mouse("mouse");

    System.out.println(mouse1);
    System.out.println(mouse2);

    System.out.println(mouse1.equals(mouse2));
    System.out.println(mouse1 == mouse2);

    Keyboard keyboard1 = new Keyboard("keyboard");
    Keyboard keyboard2 = new Keyboard("keyboard");

    System.out.println(keyboard1);
    System.out.println(keyboard2);

    System.out.println(keyboard1.equals(keyboard2));
    System.out.println(keyboard1 == keyboard2);
  }
}
