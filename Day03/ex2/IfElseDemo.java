package ex2;

import java.util.Scanner;

public class IfElseDemo {
  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("숫자를 입력하세요 : ");
//    int i = scanner.nextInt(); // | = Shift + won (back space 옆), \ = won
//    int res = i % 2;
//    if(res == 0){ // { 대신 ';' 입력하면 if 바로 끝, 바로 print, '; {'도 if 바로 끝
//      System.out.printf("입력받은 숫자는 %d 이고 짝수 입니다.\n", i );
//    }
//    else { // true만 실행, {} 문법적으로 생략 가능하지만 햇갈려
//      System.out.printf("입력받은 숫자는 %d 이고 홀수 입니다.\n", i);
//    }// if 블록의 중괄호
//    System.out.println("프로그램 종료");
//  } // main method 블록의 중괄호
//} // class 블록의 중괄호
    Scanner scanner = new Scanner(System.in);
    System.out.print("숫자를 입력하세요 : ");
    int i = scanner.nextInt(); // | = Shift + won (back space 옆), \ = won

    if(i >= 0){ // { 대신 ';' 입력하면 if 바로 끝, 바로 print, '; {'도 if 바로 끝
      System.out.printf("입력받은 숫자는 %d 이고 양수 입니다.\n", i );
    }
    else { // true만 실행, {} 문법적으로 생략 가능하지만 햇갈려
      System.out.printf("입력받은 숫자는 %d 이고 음수 입니다.\n", i);
    }// if 블록의 중괄호
    System.out.println("프로그램 종료");
  } // main method 블록의 중괄호
} // class 블록의 중괄호
