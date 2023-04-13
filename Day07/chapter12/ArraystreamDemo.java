package chapter12;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraystreamDemo {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    IntStream stream = Arrays.stream(arr);

    Integer [] arr2 = {1,2,3};
    Stream<Integer> stream2 = Arrays.stream(arr2);

    String[] StrArr = {"a", "b", "c", "d"};
    Stream<String> stream1 = Arrays.stream(StrArr);

    double[] arr3 = {1.1, 2.2, 3.3};
    DoubleStream arr31 = DoubleStream.of(arr3);

  }
}
