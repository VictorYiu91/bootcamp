package inheritance;
// ! In Java, all classes by default implicitly extends Object.class

public class DemoObject {
  public static void main(String[] args) {
    Object o1 = new Object(); // Object.class is a concrete class
    // ! In Primitive World, Java helps conversion.
    int x = 3; // int variable and int value
    long l = 3; // long variable and int value

    // ! In Class (non-primitive) World, Java use polymorphism to explain reference and object.
    // Long l2 = new Integer(3); // ! Classes by default have no relationship each others.
    Cat c1 = new Cat("Lucas", 10, 2.3);

    Animal a1 = new Cat("Leo", 3, 2.4);
    System.out.println(a1.intro());
    a1 = new Dog ("Baby",2,true);
    System.out.println(a1.intro());
    System.out.println(a1.getName());
    System.out.println(a1.getAge());
    
  }
}