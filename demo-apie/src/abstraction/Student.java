package abstraction;

public class Student extends Human{
  public Student(String name) {
    super(name);
  }
  @Override
  public void eat() {
    System.out.println("Student " + super.getName() + " is eating ...");
  }
}
