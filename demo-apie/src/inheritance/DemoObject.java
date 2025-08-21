package inheritance;
// ! In Java, all classes by default implicitly extends Object.class

public class DemoObject {
  public static void main(String[] args) {
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
    
    // Object.class
    // ! Cat extends Animal extends Object
    Object o1 = new Object(); // Object.class is a concrete class
    o1 = new Cat("Lucas" , 2, 3.4);
    // Disadvantage: o1 can only call Object's method
    // o1.getName(); X

    // By default, Java disallow assigning o1 (Object object) to c2 (Cat type)
    // because it is risky.
    // Solution: Taking risk fo conversion by Casting
    Cat c2 = (Cat)o1;
    System.out.println(c2.getName()); // Lucas

    Cat c3 = new Cat("Lucas", 2, 3.4);
    System.out.println(c2.equals(c3)); 
    // falsem before rewriting
    // they are differenct obejct, before rewriting equals in Cat.class
    // so, actually c2.equals() is referring to Object.equals
    // True, after rewriting equals() in Cat.class

    System.out.println(c2.hashCode()==c3.hashCode()); // true, because rewritinig hashCode
    System.out.println(c2);
    System.out.println(c3);
  }
}