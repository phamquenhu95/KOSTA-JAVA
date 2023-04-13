package ex5;

public class StudentDemo2 {
  public static void main(String[] args) {
    Person p;
    Person p1 = new Person();
    Student s = new Student();
    p = s; //upcasting
    p.whoAmI();
    System.out.println(p.name);

    Student s1 = (Student) p; //downcasting
    s1.work();
    s1.whoAmI();
    System.out.println(s1.name + s1.number);

    Employee e = new Employee();

    callingPerson(p1);
    callingPerson(p);
    callingPerson(s);
    callingPerson(e);

  }

  static void callingPerson(Person p) { // p,s,e 다 됨 자동으로 , 밑에 없어도 됨

    // student 이면 work + number
    if(p instanceof Student) {
      System.out.println("student");
      Student s = (Student) p;
      s.work();

    }else if (p instanceof Employee) { // employee 이면 work + title
      System.out.println("employee");
      Employee e = (Employee) p;
      e.work1();
    } else { // if (p instanceof Person) { // person 이면
      System.out.println("person");
      p.whoAmI();
    }
  }

//  static void callingPerson(Student s) {
//    s.whoAmI();
//  }
//
//  static void callingPerson(Employee e) {
//    e.whoAmI();
//  }
}
