package inheritance;

public class Dog extends Animal {
  private boolean isMale;

  public Dog(String name, int age, boolean isMale) {
    super(name, age);
    this.isMale = isMale;
  }

  public boolean isMale() {
    return this.isMale;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Dog))
      return false;
    Dog dog = (Dog) obj;
    return this.isMale == dog.isMale() //
        && super.getName().equals(dog.getName()) //
        && super.getAge() == dog.getAge();
  }

  public static void main(String[] args) {
    Dog d1 = new Dog("John", 3, false);
    Dog d2 = new Dog("Peter", 4, true);
    System.out.println(d1.isMale());
  }
}