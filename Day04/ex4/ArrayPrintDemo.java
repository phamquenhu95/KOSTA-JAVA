package ex4;

import java.util.Arrays;

public class ArrayPrintDemo {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if ( i != arr.length - 1 ) {
        System.out.print(", ");
      }
    }
    System.out.println("] \n");
    System.out.println(arr); // 주소 출력, [ 한쪼ㅗㄱ만 있음 -> 배열, 'ㅑI' integer, java 제공해준 Arrays 상속 받음
    System.out.println(Arrays.toString(arr)); // 주소 안 나옴, array 나ㅗㅁ

    char [] cArr = {'a', 'b', 'c'};
    System.out.println(cArr); // abc 출력
    System.out.println(Arrays.toString(cArr)); // [a, b, c] 출력

    String str = "abc";
    System.out.println(str.charAt(0));
  }
}
