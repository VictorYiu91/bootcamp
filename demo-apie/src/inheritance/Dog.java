package inheritance;
import inheritance.Animal;

public class Dog extends Animal {
  private boolean isMale;

  public Dog(String name, int age, boolean isMale) {
    super(name, age);
    this.isMale = isMale;
  }

  public boolean isMale() {
    return this.isMale;
  }

  public static void main(String[] args) {
    Dog d1 = new Dog("Happy", 8, true);
    System.out.println(d1.getAge());
    Dog d2 = new Dog("Cookie", 4, false);
    System.out.println(d2.isMale());
  }
}
