package com.bootcamp.demo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// @AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Student {
  private String name;
  // private Calculator calculator;
  private MathOperation mathOperation;

  // ! Dependency Injection
  public Student(String name, MathOperation mathOperation) {
    this.name = name;
    if (mathOperation == null)
      throw new IllegalArgumentException("Calculator cannot be null.");
    this.mathOperation = mathOperation;
  }

  // public Student(String name) {
  // this.name = name;
  // this.calculator = new Calculator();
  // }

  // ! Method A: Student.operate() calls Method B: MathOperation.operate()
  // ! For Junit Test (Student.class), to test operate()m the test cases only cover the value add part.
  // ! Junit Framework provides Mock test function so that we can assume the result of internal method call.
  public int operate(int x, int y) {
    if (x > y)
      // ! Day 1
      // return this.mathOperation.operate(x, y) * x;
      // ! Day 2
      return this.mathOperation.operate(x, y + 2) * x;
    else
      // ! Day 1
      // return this.mathOperation.operate(x, y) * y;
      // ! Day 2
      return this.mathOperation.operate(x, y + 3) * y;
  }


  // sum, subtract, multiply, divide
  // public int sum(int x, int y) {
  // return x + y;
  // }

  public static void main(String[] args) {
    Student s1 = new Student("John", (x, y) -> x + y);
  }
}
