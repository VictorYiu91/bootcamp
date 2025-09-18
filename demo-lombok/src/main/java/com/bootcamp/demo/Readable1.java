package com.bootcamp.demo;

@FunctionalInterface
public interface Readable1 {
  void read();

  // ! Design Approach
  // Java 8
  default void teach() {
    System.out.println("By default teach() method.");
  }

  // Java 8
  static int sum(int x, int y) {
    return x+y;
  }
}
