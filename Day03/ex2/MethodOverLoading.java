package ex2;

public class MethodOverLoading {
  public static void main(String[] args) {
    System.out.println(max(10, 20));
    System.out.println(max(20.0, 10.0));

    System.out.println(min(10, 20));
    System.out.println(min(20.0, 10.0));

    System.out.println(min(20, 10, 30));
    System.out.println(max(20, 10, 30));

  }

  public static int max(int i1, int i2) {
    return (i1 > i2) ? i1 : i2;
  }

  public static double max(double d1, double d2) {
    return (d1 > d2) ? d1 : d2;

  }
  public static int max(int i1, int i2, int i3) {
    return max( max(i1,i2), i3);

  }
  public static int min(int i1, int i2) {
    return (i1 < i2) ? i1 : i2;
  }

  public static double min(double d1, double d2) {
    return (d1 < d2) ? d1 : d2;

  }
  public static int min(int i1, int i2, int i3) {
    return min(i1, min(i2, i3));

  }


}


