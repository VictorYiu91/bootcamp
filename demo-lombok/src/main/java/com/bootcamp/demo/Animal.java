package com.bootcamp.demo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public abstract class Animal {
  private int age;

  public Animal(int age) {
    this.age = age;
  }
}
