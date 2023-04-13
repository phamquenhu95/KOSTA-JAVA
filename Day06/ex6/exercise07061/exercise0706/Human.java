package ex6.exercise07061.exercise0706;

public interface Human {
  static void echo() {
    System.out.println("야호!!!");
  }

  void eat();

  default void print() {
    System.out.println("인간입니다.");
  }
}

class Worker implements Human {
  public void eat() {
    System.out.println("빵을 먹습니다.");
  }

}

class Student implements Human {
  int age;
  public Student(int age) {
    this.age = age;
  }
  public void eat() {
    System.out.println("도시락을 먹습니다.");
  }
@Override
  public void print() {
    System.out.println(age + "세의 학생입니다.");
  }
}
