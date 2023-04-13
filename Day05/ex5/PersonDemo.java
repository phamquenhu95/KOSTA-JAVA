package ex5;

public class PersonDemo {
  public static void main(String[] args) {
    Person p, p1; // p =null name 메소드만 가져
    Student s1;
    Employee e1;
    Student s = new Student(); // s = work + whoAmI
    Employee e = new Employee();
    p = s; // p = (Person)s; 자동 형변환 = UpCasting

    p.name = "John";
    p.whoAmI();
//    p.number(); // 못 써
//    p.work(); // 못 써

    p1 = e;
    p1.name = "홍길동 ";
    p1.whoAmI();
    //    p1.title(); // 못 써
//    p1.work(); // 못 써

//    s1 = e1; // 형제끼리 안됨 ( 강체 + 자동 다 안됨), 부모관계만 가능 -> Upcasting

  }
}
