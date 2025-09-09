public class DemoInnerClass {
  public static void main(String[] args) {
    Student s1 = new Student(12);
    
    // Nested static class
    Bag.Ball b1 = new Bag.Ball(Bag.Color.RED);

    // Inner Class
    Student.College c1 = new Student(15).new College("Lucas");
    System.out.println(c1.studentInfo()); // College object can read Student object data
  }
}
