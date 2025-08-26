package inheritance;
// A = Abstraction (Interface)
// P = Polymorphism
// ! I = Inheritance
// E = Encapsulation

import java.util.Objects;

public class Cat extends Animal { // Child (Cat), Parent (Animal)
  // ! Inherit
  // 1. Attributes
  // 2. Instance Methods
  // ! Do not Inherit
  // 1. Constructor

  private double weight;

  public Cat(String name, int age, double weight) {
    // New Java keyword: super
    super(name, age); // calling parent class (Animal) constructor
    this.weight = weight;
  }

  public double getWeight() {
    return this.weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  // Child instance method call Parent instance method
  public int getAge() {
    System.out.println("Cat getAge");
    return super.getAge();
  }

  // Method Signature = method name + parameters
  // for Override, rule = method signature + return type
  @Override
  public boolean equals(Object obj) {
    // Step 1:
    if (this == obj)
      return true;
    // Step 2: if obj is not an Cat object, return false
    // ! instanceof = asking if obj is an object of Cat
    if (!(obj instanceof Cat))
      return false;
    // Step 3: Because obj MUST be a cat object.
    Cat cat = (Cat) obj;
    return Objects.equals(super.getName(), cat.getName()) //
        && Objects.equals(super.getAge(), cat.getAge()) //
        && Objects.equals(this.weight, cat.getWeight());
    // return super.getName().equals(cat.getName()) //
    // && super.getAge() == cat.getAge() //
    // && this.weight == cat.getWeight();
  }

  @Override // ! Override -> checking if your parent class has this method.
  public int hashCode() {
    return Objects.hash(this.weight, super.getAge(), super.getName());
  }

  @Override
  public String toString() {
    return "Cat(" //
        + super.toString() //
        + ",weight=" + this.weight //
        + ")";
  }

  public static void main(String[] args) {
    Cat c1 = new Cat("John", 8, 4.5);
    System.out.println(c1.getAge());

    Cat c2 = new Cat("Peter", 9, 5.5);
    System.out.println(c2.getAge());

    System.out.println(c1); // Cat(Animal=Animal(name=John,age=8),weight=4.5)

  }
}