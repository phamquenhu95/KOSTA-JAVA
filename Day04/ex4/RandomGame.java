package ex4;

import java.util.Arrays;

public class RandomGame {
  // Math.randam 에서드를 이용하여 가위, 바위, 보를 랜덤하게 출력하는 게임
  // String [] name = ["가위", "바위", "보" }
  // sout(name)
  // sout(Arrays.toString(name));
//  for(int i = 0; i <10; i++)

  public static void main(String[] args) {


    String [] name = {"가위", "바위", "보"};
    int tmp;
    System.out.println(name);
    System.out.println(Arrays.toString(name));


    for(int i = 0; i < 10; i++) {
//      System.out.println(Math.random());
//      System.out.println(Math.random() * 3); // 0부터 3까지
      tmp = (int)(Math.random() * 3);
      System.out.println(name[tmp]);
//      System.out.println((int)Math.random() * 3);

      //      System.out.println((int)(Math.random() * 3));
    }

  }
}
