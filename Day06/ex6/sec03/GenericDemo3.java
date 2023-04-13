package ex6.sec03;

import java.util.ArrayList;

public class GenericDemo3 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add(1);
    list.add('a');
    list.add(true);
    list.add("abc");

    int res;
    if(list.get(0) instanceof Integer) {
      res = (int)list.get(0) + 1;
    } else if(list.get(0) instanceof String) {
      res =Integer.parseInt((String)list.get(0) + 1);
    }

//    System.out.println(res);

  }
}
