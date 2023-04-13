package ex2;

public class MethodDemo {
  public static void main(String[] args) {
    // System.out.println(plus(2_000_000_000,2_000_000_000)); // 2_000_000_000 + 2_000_000_000 = 4_000_000_000 -> int 범위 넘어서 long으로 바뀌야 됨

    plus(2_000_000_000,2_000_000_000);
  }

//  public static long plus( int i1, int i2) {
//    return (long)i1 + i2; // long 하나만 바꾸면 됨

//    public static long plus( long i1, long i2) { // 반환하여 2개의 값을 더해서 출력
//      return i1 + i2;

    public static void plus( long i1, long i2) { //반환없이 2개의 값을 더해서 출력하고 종료
      System.out.println("i1 + i2 = " + (i1 + i2));


  }



}
