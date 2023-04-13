package ex6.sec04;

public class EntryDemo {
  public static void main(String[] args) {
    Entry <String, Integer> entry = new Entry<>("홍길동", 30);
    String name = entry.getKey();
    Integer age = entry.getValue();
    System.out.println(name + ", " + age);
    Entry <String, Integer> entry1 = new Entry<>("김선당", 20);
    Entry <Integer, String > entry2 = new Entry<>(30, "홍길동" );
    Entry <String, String> entry3 = new Entry<>("홍길동", "30");
  }
}
