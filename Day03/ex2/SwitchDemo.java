package ex2;

//public class SwitchDemo {
//  public static void main(String[] args) {
//    int value = 10;
//    switch (value) {
//      case 10 :
//        System.out.println("10입니다.");
//        break; // break 없으면 3개 다 출력
//      case 11:
//        System.out.println("11입니다.");
//        break;
//      default:
//        System.out.println("둘다 아닙니다.");
//
//    }
//  }
//}

//public class SwitchDemo {
//  public static void main(String[] args) {
//    double value = 10.0;
//    switch ((int)value) {
//      case 10 :
//        System.out.println("10입니다.");
//        break; // break 없으면 3개 다 출력
//      case 11:
//        System.out.println("11입니다.");
//        break;
//      default:
//        System.out.println("둘다 아닙니다.");
//
//    }
//  }
//}


import java.util.Scanner;

public class SwitchDemo {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    char botton;
    String product;

    while (true) {
      botton = in.nextLine().charAt(0);
// butoon ==> X, x 입력이 되면 종료
//  X, x 아니면 => switch 문을 사용해서 계속 자판기에서 제품을 꺼내먹는다
      if (botton == 'X' || botton == 'x')
        break;
      switch (botton) {
        case 'A':
        case 'a':
          product = "콜라";
          break;
        case 'B':
        case 'b':
          product = "사이다";
          break;
        case 'C':
        case 'c':
          product = "환타";
          break;

        default:
          product = "없음.";

      }
      System.out.println(product);
    }
  }
}
