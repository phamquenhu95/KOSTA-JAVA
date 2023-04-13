package ex2;

public class PrintDemo {
  public static void main(String[] args) {
    System.out.println(1);
    System.out.println(2);
    System.out.println(3);

    System.out.print('a');
    System.out.print('b');
    System.out.print('c');

    int i1 = 1, i2 = 2, i3 = 3;
    float f1 = 1.0f, f2 = 2.0f, f3 = 3.0f;

    System.out.println("i1 = " + i1 + " , i2 = " + i2 + ", i3 = " + i3);
    System.out.printf(" i1 = %d , i2 = %d , i3 = %d ", i1, i2, i3);
    System.out.printf(" f1 = %.1f , f2 = %.2f , f3 = %.3f \n", f1, f2, f3);
    System.out.printf(" i1 = %d , f1 = %.1f \n", i1, f1);
  }
}
