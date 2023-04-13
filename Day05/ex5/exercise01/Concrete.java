package ex5.exercise01;

public class Concrete extends Abstract{
  int j;
  public Concrete(int i, int j) {
    super(j);
    this.j = j;

  }

  @Override
  void method() {

  }

  public void show() {
    System.out.printf(" i = %d, j = %d\n", i, j);
  }
}
