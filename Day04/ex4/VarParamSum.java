package ex4;

public class VarParamSum {
  public static void main(String[] args) {
    System.out.println(sum(1,2,3,4));
    int [] arr = {2,3};
    System.out.println(sum(1, arr));
    System.out.println(sum(1,2,3,4,5));

  }

  static int sum(int i, int...args) {
    int sum = 0;
    for (int arg : args) {
      sum += arg;
    }
    return sum;
  }

}
