package ex2;

import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("첫번째 숫자를 입력하세요 : ");
    int x = in.nextInt();
    System.out.println("두번째 숫자를 입력하세요 : ");
    int y = in.nextInt();
    System.out.printf("x + y = %d + %d = %d ", x, y, x+y);

  }
}
