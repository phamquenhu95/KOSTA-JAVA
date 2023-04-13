package ex4;

import java.util.Scanner;

public class CountCharProgram {
  public static void main(String[] args) {
    // 문문자열과 문자를 매개변수 값으로 가지는 다음 메서드가 있다. 문자열 s에 포함된 문자 c의 개수를 반환하도록 이 메서드를 구하기
    // static int countChar (String s, char c)
    // 입력 Hello, L -> 2번 포함, hello, l -> 2번 포함


    Scanner in = new Scanner(System.in);
    System.out.print("문자열 입력하세요: ");
    String s = in.nextLine();
    System.out.print("문자 입력하세요: ");
    char c = in.next().charAt(0);

    System.out.printf("%s 문자열 안에는 %s 문자가 %d 번 포함되어 있다.", s, c, countChar(s, c));
  }
    static int countChar(String s, char c) {
    int count = 0;
      for (int i = 0; i < s.length(); i++) {
        if ((s.charAt(i) + "").equalsIgnoreCase(c+"")) {
          count++;
        }
      }
      return count;
    }
  }

