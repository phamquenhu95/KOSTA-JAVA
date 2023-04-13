package ex6;

public class ExceptionDemo2 {
  public static void main(String[] args) {

    try { // Ctrl + Alt + T -> try/catch
      test1("123");
      test1("abc");
    } catch (NumberFormatException e) {
      System.out.println("숫자로 변환할 수 없는 문자입니다.");
      System.out.println(e.getMessage());

    }finally {

    }

  }
  private static void test1(String s) throws NumberFormatException {

    int n = Integer.parseInt(s); // "123" OK, "abc" not OK
    System.out.println(n);
  }
}
