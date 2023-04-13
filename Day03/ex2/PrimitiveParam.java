package ex2;

public class PrimitiveParam {
  public static void main(String[] args) {
    int sum = 100;
    System.out.println("before method : sum = " + sum);
    increment(sum);
    System.out.println("after method : sum = " + sum);
  }

  public static void increment(int i) {
    int sum = i;
    sum++; // 지역 변수
    System.out.println("in method : sum = " + sum);



  }

}
