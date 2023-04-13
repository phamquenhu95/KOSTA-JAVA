package ex2;

import java.util.Scanner;

public class GradeIfDemo {
  public static void main(String[] args) {

//    Scanner scanner = new Scanner(System.in);
//    System.out.print("숫자를 입력하세요 : ");
//    int i = scanner.nextInt(); // | = Shift + won (back space 옆), \ = won
////작은 범위부터 해야 됨
//    if(i >= 90 && i <= 100){ // 90점 이상이면 90<= i <=100
//      System.out.printf("입력받은 숫자는 %d 이고 A 입니다.\n", i );
//    }else if(80 <= i && i < 90){ // 80점 이상이면 80<= i < 90
//      System.out.printf("입력받은 숫자는 %d 이고 B 입니다.\n", i);
//    }else if(70 <= i ) { //70점 이상이면 70<= i < 80
//        System.out.printf("입력받은 숫자는 %d 이고 C 입니다.\n", i);
//    }else { //70미만 F (i < 70)
//      System.out.printf("입력받은 숫자는 %d 이고 F 입니다.\n", i);
//    }
//    System.out.println("프로그램 종료");
//  }
//}
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("숫자를 입력하세요 : ");
//    int i = scanner.nextInt();
//    char grade;
//
//    if(i >= 90 ){ // 90점 이상이면 90<= i <=100
//      grade = 'A';
//    }else if(80 <= i ){ // 80점 이상이면 80<= i < 90
//      grade = 'B';
//    }else if(70 <= i ) { //70점 이상이면 70<= i < 80
//      grade = 'C';
//    }else { //70미만 F (i < 70)
//      grade = 'F';
//    }
//    System.out.println("grade = " + grade);
//    System.out.println("프로그램 종료");
//  }
//}

    Scanner scanner = new Scanner(System.in);
    System.out.print("숫자를 입력하세요 : ");
    int i = scanner.nextInt();


    // 입력받은 점수가 유효한 범위 내에 있는지 검사
    if (validateScore(i)) {
      String grade;

      if (i >= 90) { // 90점 이상이면 90<= i <=100
        if (i >= 95) {
          grade = "A+";
        } else {
          grade = "A0";
        }
      } else if (i >= 80) { // 80점 이상이면 80<= i < 90
        grade = "B";
      } else if (i >= 70) { //70점 이상이면 70<= i < 80
        grade = "C";
      } else { //70미만 F (i < 70)
        grade = "F";
      }
      System.out.println("grade = " + grade);
    }
    System.out.println("프로그램 종료");
  }// main

  public static boolean validateScore(int i) {
    if (i < 0 || i > 100)
      return false; // false 만나면 프로그램 종료, 나가
    return true; // 위로 옭겨도 됨

//    return(i < 0 || i > 100) ? false : true;
//    return true;

  }


}

