package ex6.exercise0706;

public interface Human {
  static void echo() {
    System.out.println("야호!!!");
  }

  void eat();

  void print();


}

class Worker implements Human {
  public void eat() {
    System.out.println("빵을 먹습니다.");
  }
  public void print() {
    System.out.println("인간입니다.");
  }
}

class Student implements Human {
  public void eat() {
    System.out.println("도시락을 먹습니다.");
  }

  public void print() {
    System.out.println("20세의 학생입니다.");
  }
}
