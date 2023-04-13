package ex1;

public class CharBoolDemo {
  public static void main(String[] args) {
    char a = 'a';
    char A = 'A';
    char one = '1'; // '' OK "" Error
    char two = '2';
    String three = "3"; // "" OK

    boolean cham = true;
    boolean geojit = false;

    System.out.println("a = " + a + "," + (int)a);
    //System.out.println("a = " + a + "," + (int)a + + "," + ++a); // ++ -> b
    System.out.println("A = " + A + "," + (int)A);
    //System.out.println("A = " + A + "," + (int)A + + "," + ++A); // ++ -> B
    System.out.println("one = " + one + "," + (int)one);
    System.out.println("cham = " + cham);

    System.out.println("one++ = " + ++one); // 0 = 48 -> ++ = 50 -> 2 (1.slide 14)
    // System.out.println("one++ = " + one++); -> 1
  }
}
