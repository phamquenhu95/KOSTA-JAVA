package ex08.chapter12;

import java.util.stream.Stream;

public class SkipDemo {
  public static void main(String[] args) {
    Stream.of("a1", "b1", "b2", "c1", "c2", "c3")
    .filter(s -> s.startsWith("c"))
        .skip(2) // 제외 시킨다
        .forEach(System.out::print);
  }
}
