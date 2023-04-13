package chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
  public static void main(String[] args) {
    List<String> list = List.of("one", "two", "three", "two");
    System.out.println(list.indexOf("two")); // 가장 먼저 / 첫번째 건만 나옴 -> 1
    System.out.println(list.contains("two"));

    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("one");
    Collection<String> list2 = new ArrayList<>();
    list2.add("two");
    List<String> list3 = new ArrayList<>();
    list3.add("one");
    list3.add("two");
    list3.add("three");
    Iterator<String> iterator = list3.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    list3.add(0, "zero"); // 하나씩 밀려서 "zero" 추가
    iterator = list3.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    System.out.println("size : " + list3.size());
//    System.out.println(list3.remove("one") + "가 삭제되었습니다.");
    System.out.println(list3.remove(1) + "가 삭제되었습니다.");
    System.out.println("size : " + list3.size());


    list3.replaceAll(s -> s.toUpperCase()); //전체 다 대문자로 바꿔
    System.out.println(list3);

    list3.forEach(s -> System.out.println(s));
    list3.forEach(System.out::println);
    System.out.println(list3.isEmpty());

  }
}
