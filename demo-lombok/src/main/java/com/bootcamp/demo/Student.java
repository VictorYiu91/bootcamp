package com.bootcamp.demo;

public class Student implements Readable1{
  @Override
  public void read() {
    System.out.println("Studen is reading...");
  }
  public static void main(String[] args) {
    // 1000000 lines for students......

    System.out.println(Readable1.sum(3,4)); // 7
  }
}
