package chapter11.exercise01;

import java.util.HashSet;
import java.util.Set;

public class PersonTest {
  public static void main(String[] args) {

  Set<Person> set = new HashSet<Person>();

  set.add(new  Person("나자바",22));
  set.add(new  Person("김열공",20));
  set.add(new  Person("최고봉",56));
  set.add(new  Person("우등생",16));
  set.add(new  Person("나자바",35));

  set.forEach(System.out::println);

}
}

class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Person) {
      Person other = (Person) obj;
      if (name!= null && name.hashCode() == other.name.hashCode()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return name + " : " + age;
  }
}




