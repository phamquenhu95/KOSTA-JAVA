package chapter11;

import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);


//    for (int i = 0; i < 4; i++) { // exception 나옴
    while (!stack.isEmpty()) {
      System.out.println(stack.pop());

    }
  }
}


