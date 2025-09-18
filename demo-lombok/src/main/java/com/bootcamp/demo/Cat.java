package com.bootcamp.demo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// @AllArgsConstructor
@Getter
// @Setter
@ToString(callSuper = true, exclude = "height")
@EqualsAndHashCode(callSuper = true)
public class Cat extends Animal {
  private double weight;
  @Setter // ! weight has setter, but height has no setter
  private double height;

  public Cat(int age, double weight, double height) {
    super(age);
    this.weight = weight;
    this.height = height;
  }

  public static void main(String[] args) {
    Cat c1 = new Cat(10, 2.8, 1.5);
    Cat c2 = new Cat(10, 2.8, 1.5);

    System.out.println(c1);
    System.out.println(c1.equals(c2));

    Cat c3 = new Cat(11, 2.8, 1.5);
    System.out.println(c1.equals(c3));
  }
}
