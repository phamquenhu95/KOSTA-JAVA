package ex5.exercise04;

public class Parent {
  String name = "영조";

  void print() {
    System.out.println("영조입니다");
  }
}

class Child extends Parent {
  String name = "사도세자";
  @Override
  void print() {
    System.out.println("사도세자입니다.");
  }
}
