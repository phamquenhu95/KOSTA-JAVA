package chapter11.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Animal {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("갈매기");
    list.add("나비");
    list.add("다람쥐");
    list.add("라마");
    list.add("동물");

    for (String animal : list) {
      System.out.println(animal);
    }
  }
}
