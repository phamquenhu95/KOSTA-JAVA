package chapter11.exercise01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PersonTest1 {
  public static void main(String[] args) {

  Set<Person1> set = new HashSet<>();


  set.add(new  Person1("김열공",20));
  set.add(new  Person1("최고봉",56));
  set.add(new  Person1("우등생",16));
  set.add(new  Person1("나자바",35));
  set.add(new  Person1("나자바",22));
  set.add(new  Person1("나자바",22));

//  set.forEach(System.out::println);
  Iterator<Person1> iterator = set.iterator();
  while(iterator.hasNext()) {

    System.out.println(iterator.next() + " ");
  }
}
}

class Person1 {
  private String name;
  private int age;

  public Person1(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int hashCode() {

    return name.hashCode() + age;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Person1) {
      Person1 other = (Person1) obj;
      if (other!= null && hashCode() == other.hashCode()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {

    return "Person[" + name + ':' + age + ']';
  }
}




