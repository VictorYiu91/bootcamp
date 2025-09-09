import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoLambdaExamples {
  public static void main(String[] args) {
    // 1. for-each loop
    List<String> names = new ArrayList<>();
    names.add("Peter");
    names.add("Leo");
    names.add("Mary");
    // Traditional Syntax
    for (String name: names) {
      System.out.println(name);
    }
    // Lambda Syntax
    names.forEach(n -> System.out.println(n));
    
    names.forEach(n -> {
      if (n.length() > 4) {
        System.out.println(n);
      }
    });

    // 2. Comparator
    // int compare (T o1, T o2)
    Comparator<Person> sortbyAgeDesc = (p1,p2) -> p1.getAge() > p2.getAge() ? -1 : 1;
    List<Person> persons = new ArrayList<>();
    persons.add(new Person(56));
    persons.add(new Person(2));
    persons.add(new Person(88));
    Collections.sort(persons, sortbyAgeDesc);
    System.out.println(persons);
    Collections.sort(persons, (p1,p2)->p1.getAge() < p2.getAge() ? -1 : 1);
  }
    public static class Person {
    private int age;

    public Person(int age) {
      this.age = age;
    }

    public int getAge() {
      return this.age;
    }
    public String toString() {
      return "Person(Age = " + this.age +")"; 
    }
  }
}
