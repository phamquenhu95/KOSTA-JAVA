package ex4;

public class MainArgumentDemo {
  public static void main(String[] args) { // 몇 개 들어오는지 모르면 '[] 대신 ... 넣어도 됨  => 가변개수
    if (args.length == 2) {
//      System.out.println(args[0] + " " + args[1]);
      nPrint(args[0], Integer.parseInt(args[1]));
    }
  }

  public static void nPrint(String msg, int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(msg);
    }
  }
}
