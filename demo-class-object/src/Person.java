// Java: Object Oriented Programming (OOP), C++, C#, etc.
// Blueprint
// 我地要描述既世界既Person，佢地淨係得Name和Age
// (Wrong Concept in Java)因為Person特徵太少(Age and Name ONLY)，呢個世界既Person好易重覆Age and Name
// (Correct) 因為我覺得/我想形容既世界既Person，Age and Name 係唔會重覆，我先會咁design個class 
public class Person {
  // Attribute ()
  private int age;
  private String name;
  //setter
  public void setAge(int age) {
    this.age = age;
    // "this" -> object; p1.setAge(17), put 17 into "this" object (p1)
  }
  public void setName (String name) {
    this.name = name;
  }
  //getter
  public int getAge() {
    return this.age;
  }
  public String getName() {
    return this.name;
  }
  public static void main(String[] args) {
    // new -> create object
    // Person -> class name
    // () -> constructor
    // p1 -> this is a name for you to call the object in memory
    Person p1 = new Person();
    
    new Person(); // create an person object in memory, but without a name for later use. (useless)
    Person p3 = new Person();
    p1.setAge(17);
    // "." goes to the object
    System.out.println(p1.getAge()); // 17
    p1.setName("Victor");
    System.out.println(p1.getName()); // Victor
    p3.setAge(65);
    p3.setName("Mary");
    System.out.println("Age= " + p3.getAge() +" & Name = " + p3.getName()); 
  }
}
