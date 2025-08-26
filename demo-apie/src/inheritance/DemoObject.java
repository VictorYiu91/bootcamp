package inheritance;
// ! In Java, all classes by default implicitly extends Object.class

import java.math.BigDecimal;

public class DemoObject {
  public static void main(String[] args) {
    // ! In Primitive World, Java helps converison.
    int x = 3; // int variable and int value
    long l = 3; // long variable and int value

    // ! In Class (non-primitive) World, Java use Polymorphism to explain reference and object
    // Long l2 = new Integer(3); // ! Classes by default have to relationship each others.
    Cat c1 = new Cat("Lucas", 10, 2.3);

    Animal a1 = new Cat("Leo", 3, 2.4);
    // Dog d1 = new Cat("Vincent", 2.3, 1);
    System.out.println(a1.intro());
    System.out.println(a1.getName());
    System.out.println(a1.getAge());

    a1 = new Dog("Vincent", 2, true);
    System.out.println(a1.intro());
    System.out.println(a1.getName());
    System.out.println(a1.getAge());

    // ! Why do we need Parent Class
    // 1. Inheritance -> Polymorphism -> Encapsulation
    // Advantages: Maintainance
    Shape s1 = new Circle(3.5, "RED");
    Shape s2 = new Square(8, "BLACK");
    Shape s3 = new Circle(4, "BLUE");

    Shape[] shapes = new Shape[] {s1, s2, s3};
    System.out.println(totalArea(shapes));

    // Object.class
    // ! Cat extends Animal extends Object
    Object o1 = new Object(); // Object.class is a concrete class
    o1 = new Cat("Lucas", 2, 3.4);
    // Disadvantage: o1 can only call Object's method
    // o1.getName();

    // By default, Java disallow assigning o1 (Object object) to c2 (Cat type)
    // because it is risky.
    // Solution: Taking risky for converison by Casting
    Cat c2 = (Cat) o1;
    System.out.println(c2.getName()); // Lucas

    Cat c3 = new Cat("Lucas", 2, 3.4);
    System.out.println(c2.equals(c3)); // true
    // False, They are different object, before rewriting equals in Cat.class
    // So, actually c2.equals() is referring to Object.equals
    // True, after rewriting equals() in Cat.class

    System.out.println(c2.hashCode() == c3.hashCode()); // true, because rewriting hashCode
    System.out.println(c2); // Cat(Animal(name=Lucas,age=2),weight=3.4)
    System.out.println(c3); // Cat(Animal(name=Lucas,age=2),weight=3.4)
  }

  // ! Parent Class
  // Method Designer: Requires object can do something (i.e. area())
  // Method User: Use Child/Parent classes relationship implement method content (how to calculate
  // area)
  public static double totalArea(Shape[] shapes) {
    BigDecimal totalArea = BigDecimal.ZERO;
    for (int i = 0; i < shapes.length; i++) {
      totalArea = totalArea.add(BigDecimal.valueOf(shapes[i].area()));
    }
    return totalArea.doubleValue();
  }
}