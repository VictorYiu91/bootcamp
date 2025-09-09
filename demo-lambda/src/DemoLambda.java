import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoLambda {
  public static void main(String[] args) {
    // Anonymous Class Approach
    // ! this approach can be for all interfaces, more than ONE method
    Eatable student = new Eatable() {
      @Override
      public void eat() {
        System.out.println("Student is able to eat ...");
      }
    };
    student.eat();

    // Lambda Approach (2014 Java 8)
    Eatable human = () -> {
      System.out.println("Human is able to eat ...");
    };
    // ! "()" : Functional Interface method signature (i.e. eat())
    // ! "->" : You are going to implement method content for eat() method
    // ! this approach is only for Functional Interface (ONE Method).

    human.eat();

    // ! Lambda Syntax
    // 1. Skip the {} brackets when there is only one line of code.
    // 2 Skip "return" keyword when there is only one line of code.
    // 3. Skip the parameter type
    Eatable human2 = () -> System.out.println("Human is able to eat ...");
    human2.eat();

    MathOperation sumFormula = (x, y) -> x + y;
    System.out.println(sumFormula.operate(10, 3)); // 13
    MathOperation substractFormula = (x, y) -> x - y;
    System.out.println(substractFormula.operate(10, 3)); // 7
    MathOperation findMax = (x, y) -> x > y ? x : y;
    // MathOperation findMax = (x, y) -> {
    // if (x > y)
    // return x;
    // return y;
    // };
    System.out.println(findMax.operate(10, 3)); // 10
    MathOperation findMin = (x, y) -> x < y ? x : y;
    System.out.println(findMin.operate(10, 3)); // 3

    // ! Java Built-in functional interface
    // 1. Function : One input -> One output
    // .apply();
    Function<String, Integer> stringLength = str -> str.length();
    System.out.println(stringLength.apply("hello")); // 5

    // 2. BiFunction : Two inputs -> One output
    BiFunction<Integer, Integer, Integer> multiplyFormula = (x, y) -> x * y;

    // 3. Consumer: One input -> 0 output / BiConsumer: Two input -> 0 output (void method)
    // .accept()
    Consumer<String> stringPrinter = s -> System.out.println(s + " hello!");
    stringPrinter.accept("John");
    BiConsumer<String, String> longerStringFormula = (s1, s2) -> {
      if (s1.length() > s2.length()) {
        System.out.println(s1);
        return; // (void method can use "return" to exit the function)
      }
      System.out.println(s2);
    };
    longerStringFormula.accept("Lucas", "Steven");

    // 4. Supplier (0 input -> 1 output)
    // .get()
    Supplier<Integer> randomNumberGenerator =
        () -> new Random().nextInt(100) + 1;
    System.out.println(randomNumberGenerator.get());

    // 5. Predicate / BiPredicate (boolean formula)
    // isElderly = age > 65
    // .test()
    Predicate<Person> elderlyDefinition = p -> p.getAge() > 65;
    System.out.println(elderlyDefinition.test(new Person(66))); // true
    BiPredicate<Person, Person> bothElderly =
        (p1, p2) -> elderlyDefinition.test(p1) && elderlyDefinition.test(p2);
    System.out.println(bothElderly.test(new Person(68), new Person(70))); // true
  }

  public static class Person {
    private int age;

    public Person(int age) {
      this.age = age;
    }

    public int getAge() {
      return this.age;
    }
  }
}
