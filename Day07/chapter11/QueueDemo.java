package chapter11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args)  {
    Queue<Integer> queue = new LinkedList<>(); // LinkedList 는 List 및 Deque 상속 받음
    queue.add(1);
    queue.add(2);
    queue.add(3);

    Iterator<Integer> iterator = queue.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }

    try {
      queue.remove(); // 안됨 -> try/catch 사용
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
