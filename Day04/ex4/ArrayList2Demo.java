package ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2Demo {
  public static void main(String[] args) {

    // n 명의 학생 점수 입력 받음
// -1 들어오면 중지
// 0~100 사이의 점수를 n 번 입력해서 scores 동적 배열에 저징
// 총점과 평점 구하기


    ArrayList<Integer> scores = new ArrayList<Integer>();
    Scanner in = new Scanner(System.in);
    int n, sum = 0;
    float avg;
    while (true) {
      System.out.println("학생의 점수룰 입력하세요. 종료하려면 -1를 입력:  ");
      n = in.nextInt();
      if (n == -1) break;
      // 동적배열에 추가
      if (n >= 0 && n<= 100) {
        scores.add(n);
      }
    }
    // 총점수 구하기
    for (int score : scores) {
      sum += score;
    }
    avg = (float)sum/scores.size();

    System.out.println("입력받은 학생들의 점수와 학생수 : "+ scores + "," + scores.size());
    System.out.println("총점수 : "+ sum);
//    System.out.println("평균점수 :  " + avg);
    System.out.printf("평균점수 :  %.2f",avg);
  }
}
