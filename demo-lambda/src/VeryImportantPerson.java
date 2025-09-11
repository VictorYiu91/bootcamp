// public class Person {
public record VeryImportantPerson(int age, String name) {
  public static final int x = 24;


  public static int getX() {
    return x+10;
  }

  // private int age;
  // private String name;
 
  // ! With
  // all args constructor
  // getter
  // toString
  // equals
  // hashCode
  
  // ! Without
  // setter
  // empty constructor

  public static void main(String[] args) {
    VeryImportantPerson p1 = new VeryImportantPerson(3, "John"); // all argument constructior
    System.out.println(p1); // toString
    System.out.println(p1.age()); // getAge() 
    System.out.println(p1.name()); // getName()
    // ! No Setter in record

    VeryImportantPerson p2 = new VeryImportantPerson(3, "John");
    System.out.println(p1.equals(p2)); // true, equals()
    System.out.println(p1.hashCode()); // 2314632
    System.out.println(p2.hashCode()); // 2314632
    System.out.println(VeryImportantPerson.getX()); // 34
  }
}
