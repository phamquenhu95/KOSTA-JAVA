package ex6;

import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    char [] a1 = {'j', 'a', 'v', 'a'};
    char [] a2 = Arrays.copyOf(a1, a1.length);
    Integer [] a3 = {1,2,3};

    printArray(a3);
    System.out.println(a2);

    String [] sa = {"케이크", "애플", "도넛", "바나나"};
//    System.out.println(Arrays.toString(sa));
    printArray(sa);

    Arrays.sort(sa);
//    System.out.println(Arrays.toString(sa));
    printArray(sa);

    Arrays.fill(sa, 2,3, "기타");
//    System.out.println(Arrays.toString(sa));
    printArray(sa);


  }

  static void printArray(Object [] array) {
//    for(Object o : array) {
//      System.out.println(o); }
    System.out.println(Arrays.toString(array));
    }
  }

