package ex6.exercise07061.exercise0706;

public class HumanTest {
  public static void main(String[] args) {
    Human.echo(); // static method , 객체 안 만들어도 됨

    Student s = new Student(20);
    s.print();
    s.eat();

    Human p = new Worker();
    p.print();
    p.eat();
  }
}
