package inheritance;
// A - Abstraction (Interface)
// P - Polymorphism
// !! I - Inheritance
// E - Encapsulation
public abstract class Animal {
  // Abstract Class vs Class
  // ! Abstract Class:
  // 1.can be extended
  // 2.With constructor
  // 3.We don't have Animal Object in the world
  // 4.With Attributes & instance methods
  // 5.With abstract method or concrete method

  // ! Class:
  // 1.can be extended
  // 2.With constructor
  // 3.for creating object
  // 4.With Attributes & instance methods
  // 5.With concrete method 

  private String name;
  private int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    System.out.println("Animal getAge");
    return this.age;
  }
  public String intro() {
    return "This is " + this.name + ", and " + this.age + " years old.";
  }
}
