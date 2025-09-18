package com.bootcamp.demo;

// ! Day 2
// Design Approach 1: include teach() method into Readable
// Desgin Approach 2: create a new interface Teachable
public class Teacher implements Readable1 {
  @Override
  public void read() {
    System.out.println("Teacher is reading...");
  }

}
