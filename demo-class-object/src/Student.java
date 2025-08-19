public class Student {
  private static int score = 100;
  private String name;
  private String id;

  public Student(String name, String id) {
    this.name = name;
    this.id = id;
  }

  // ! Instance method
  public int calculate(int x, int y) {
    return x + y + this.name.length();
  }

  // ! Static method
  // ! You CAN/SHOULD use static here. Because you didn't use object attribute for processing)
  public static int calculate2(int x, int y) {
    return x + y;
  }

  // ! Instance method
  public void setName(String name) {
    this.name = name;
  }

  // ! Instance method
  public void setId(String id) {
    this.id = id;
  }

  // ! Instance method
  public String getName() {
    return this.name;
  }

  // ! Instance method
  public String getId() {
    return this.id;
  }

  // ! Instance method
  public String toString() {
    return "Student(" //
        + "name=" + this.name //
        + ", id=" + this.id//
        + ")";
  }

  public static void main(String[] args) {
    Student s1 = new Student("John", "HKU1234");
    Student s2 = new Student("Peter", "HKU4321");
    System.out.println(s1);
    System.out.println(s2);

    System.out.println(s1.calculate(3, 4)); // 11
    System.out.println(s2.calculate(3, 4)); // 12

    // The correct way to call static method:
    System.out.println(Student.calculate2(100,53)); // 153

    // Object is able to call static method, but not recommended
    System.out.println(s1.calculate(100, 53)); // 153
  }
}
