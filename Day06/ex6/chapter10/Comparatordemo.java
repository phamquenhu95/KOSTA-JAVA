package ex6.chapter10;

import java.util.Arrays;
import java.util.Comparator;

public class Comparatordemo {
  public static void main(String[] args) {
    String[] strings = {"ajlkdfjlsadf",
                        "easjdflkasjfl",
                        "balkswjfrlieoure"};
    Arrays.sort(strings, new Comparator<String>() {

      @Override
      public int compare(String o1, String o2) {
        return o2.length() - o1.length(); // 긴 건 먼저 나옴, so sanh do dai
      }
    });
    for (String s : strings) {
      System.out.println(s);
    }
    Arrays.sort(strings, (o1, o2) -> o1.length() - o2.length()); // 짧은 건 먼저 나옴, so sanh do dai
    // lambda
    for (String s : strings) {
      System.out.println(s);
    }
  }
}


