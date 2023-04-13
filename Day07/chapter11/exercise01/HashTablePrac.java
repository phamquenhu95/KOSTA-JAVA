package chapter11.exercise01;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTablePrac {
  public static void main(String[] args) {
    Map<String,Integer> map = new Hashtable<>();

    map.put("김열공", 80);
    map.put("최고봉", 90);
    map.put("우등생", 95);
    map.put("나자바", 86);
    map.put(null, 100);

    System.out.println("점수를 확인하고자 하는 학생의 이름을 입력하세요 : ");
    Scanner in = new Scanner(System.in);
    String name = in.nextLine();

    if(map.containsKey(name)) {
      System.out.println(map.get(name));
    } else {
      System.out.println("해당하는 이름이 없습니다.");
    }

  }


}
