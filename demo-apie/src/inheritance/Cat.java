package inheritance;

import java.util.Objects;

public class Cat extends Animal { // Child (Cat), Parent (Animal)
  // ! Inherit
  // 1. Attributes
  // 2. Instance Methods
  // ! Do not Inherit
  // 1. Constructor
  private double weight;

  public Cat(String name, int age, double weight) {
    // New Java Keyword: super
    super(name, age); // calling parent class (Animal) constructor
    this.weight = weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getWeight() {
    return this.weight;
  }

  public int getAge() {
    System.out.println("Cat getAge");
    return super.getAge();
  }
  // Method Signature = method name + parameters
  // for Override, method signature + return type
  // Object.equals : return type = boolean
  // method signature = equals(Object object)

  @Override
  public boolean equals(Object obj) {
    // Step 1:
    if (this == obj) {
      return true;
    }
    // Step 2: if obj is not an Cat object, return false
    // instanceof = asking if obj is an object of Cat
    if (!(obj instanceof Cat))
      return false;
    // Step 3: because obj MUST be a cat object
    Cat cat = (Cat) obj;
    // new Syntax
    return Objects.equals(super.getName(), cat.getName()) //
        && Objects.equals(super.getAge(), this.getAge()) //
        && Objects.equals(this.weight, cat.getWeight());
    // Old Syntax
    // return super.getName().equals(cat.getName()) //
    // && super.getAge() == cat.getAge() //
    // && this.getWeight() == cat.getWeight();
  }

  @Override
  public String toString() {
    return "Cat(" //
        + super.toString() //
        + " ,weight= " + this.weight //
        + ")";
  }

  @Override // ! Override, checking if your parent class has this method
  public int hashCode() {
    return Objects.hash(this.weight, super.getAge(), super.getName());
  }

  public static void main(String[] args) {
    Cat c1 = new Cat("John", 8, 4.5);
    System.out.println(c1.getAge());

    Cat c2 = new Cat("Peter", 9, 5.5);
    System.out.println(c2.getAge());
    System.out.println(c1);
  }
}
