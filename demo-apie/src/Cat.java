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
  public static void main(String[] args) {
    Cat c1 = new Cat("John", 8, 4.5);
    System.out.println(c1.getAge());

    Cat c2 = new Cat("Peter", 9, 5.5);
    System.out.println(c2.getAge());
  }
}
