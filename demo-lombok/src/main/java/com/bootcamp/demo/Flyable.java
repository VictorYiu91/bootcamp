package com.bootcamp.demo;

// ! Java 8: Interface
public interface Flyable {
  // abstract method
  void fly();

  // after java 8 - default method in interface
  // concrete method
  default void swim() {
    System.out.println("By default, I am able to swim...");
  }
}
