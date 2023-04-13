package ex2;

import java.util.Scanner;

public class ArithmeticDemo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("숫자를 입력하세요 : ");
    int i = scanner.nextInt(); // | = Shift + won (back space 옆), \ = won
    System.out.printf("입력받은 숫자는 %d 이고 이 숫자는 2로 나누면 나머지가 %d 입니다.", i, i%2 );

  }
}
