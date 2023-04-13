package ex6.exercise0706;

public class HumanTest {
  public static void main(String[] args) {
    Human.echo(); // static method

    Student s = new Student();
    s.print();
    s.eat();

    Human p = new Worker();
    p.print();
    p.eat();
  }
}
