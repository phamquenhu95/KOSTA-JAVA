package ex4;

import java.util.Arrays;
import java.util.Scanner;

public class Array1Demo {
  public static void main(String[] args) {
    // 화면으로부터 학생 5 명의 점수를 입력받음
    // 5명의 점수를 배열에 저장
    // 배열을 읽어서 총점과 평균을 구하기

//    int[] scores = new int[5];
//    for (int i = 0; i < scores.length; i++) {
//      scores[i] = (int)(Math.random() * 100);
//    }
//    System.out.println("총점: " + sum(scores));
//    System.out.println("평균: " + average(

    Scanner in = new Scanner(System.in);

    int [] scores = new int [5];

    for (int i = 0; i < scores.length; i++) {
      scores[i] = in.nextInt();
    }
//    int sum = 0;
//    for (int i = 0; i < scores.length; i++) {
//      sum += scores[i];
//    }
    int sum = 0;
    for (int score : scores) {
      sum += score;
    }

    float avg = sum/(float)scores.length;

    System.out.println("입력받은 학생 점수 = " + Arrays.toString(scores));
    System.out.println("총점수 = " + sum );
    System.out.println("평균점수 = " + avg);



  }
}
