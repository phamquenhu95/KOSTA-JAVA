package ex6;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
  public static void main(String[] args) {
    String s = "of the people, by the people, for the people";

    StringTokenizer st = new StringTokenizer(s, " ,", true);
    System.out.println(st.countTokens());
    while(st.hasMoreTokens()) {
      System.out.println("[" + st.nextToken() + "]");
    }

    StringTokenizer st1 = new StringTokenizer(s, ",");
    System.out.println(st1.countTokens());

    StringTokenizer st2 = new StringTokenizer(s, " ");
    System.out.println(st2.countTokens());
  }

}
