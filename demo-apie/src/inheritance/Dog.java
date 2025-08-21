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
    return super.getName().equals(dog.getName()) //
        && super.getAge() == dog.getAge() //
        && this.isMale == dog.isMale();
  }

  public static void main(String[] args) {
    Dog d1 = new Dog("Happy", 8, true);
    System.out.println(d1.getAge());
    Dog d2 = new Dog("Cookie", 4, false);
    System.out.println(d2.isMale());
  }
}
