package chapter11.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Prac01 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("갈매기");
    list.add("나비");
    list.add("다람쥐");
    list.add("라마");

    for(String s : list) {
      if(s.length() == 2) {
        System.out.println(s);
      }
    }
  }
}
