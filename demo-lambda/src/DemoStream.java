import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {
  public static void main(String[] args) {
    // Lambda -> Stream
    // Prepare Persons: John 38, Jennie 67, Steven 18
    // Use loop to filter elder (age > 65), and then print the name
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John", 38));
    persons.add(new Person("Jennie", 67));
    persons.add(new Person("Steven", 18));
    persons.forEach(p -> {
      if (p.getAge() > 65) {
        System.out.println(p.getName());
      }
    });

    // ! Lambda -> Stream mode
    persons.stream() // Stream Object
        .filter(p -> p.getAge() > 65) //
        .forEach(p -> System.out.println(p.getName()));
    // Conclusion sort a list : for loop + if -> .stream().filter()

    // filter + collect into another List
    // List<Person> -> Stream<Person> -> List<Person>
    List<Person> elderlyPersons = persons.stream() //
        // .filter(p -> p.getAge() > 65) //
        // .filter(p -> p.isElderly()) //
        .filter(Person::isElderly) //
        .collect(Collectors.toList());
    System.out.println(elderlyPersons);

    // name contains J and age < 40
    // collect to another list

    List<Person> youngJPersons = persons.stream() //
        .filter(p -> p.getName().contains("J") && p.getAge() < 40) //
        .collect(Collectors.toList());
    System.out.println(youngJPersons);

    // List<Integer>: 8,7,3,100,97
    // Collect all odd numbers to another List<Integer>
    List<Integer> numbers = new ArrayList<>();
    numbers.add(8);
    numbers.add(7);
    numbers.add(3);
    numbers.add(100);
    numbers.add(97);
    List<Integer> oddNumbers =
        numbers.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());
    System.out.println(oddNumbers);


    // List<List<String>>
    // List 1: "apple","banana","orange"
    // List 2: "John","Lucas","Leo"
    // List 3: "Monday","Friday","Wednesday"
    // filter list with string length > 5
    // Output List<List<String>>
    List<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("banana");
    fruits.add("orange");
    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Lucas");
    names.add("Leo");
    List<String> weekdays = new ArrayList<>();
    weekdays.add("Monday");
    weekdays.add("Friday");
    weekdays.add("Wednesday");
    List<List<String>> stringsList = new ArrayList<>();
    stringsList.add(fruits);
    stringsList.add(names);
    stringsList.add(weekdays);

    List<List<String>> stringLength5 = stringsList.stream() //
        .filter(list -> {
          for (String s : list) {
            if (s.length() > 5) {
              return true;
            }
          }
          return false;
        }).collect(Collectors.toList());
    System.out.println(stringLength5);

    // List<Person> -> List<String>
    Comparator<Person> sortedByAgeDesc =
        (p1, p2) -> p1.getAge() > p2.getAge() ? -1 : 1;
    List<String> namesList = persons.stream() // stream<Person>
        .sorted((sortedByAgeDesc)) //
        .map(p -> p.getName()) // stream<String>
        .collect(Collectors.toList()); // List<String>
    System.out.println(namesList);
  }

  public static class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return this.name;
    }

    public int getAge() {
      return this.age;
    }

    public boolean isElderly() {
      return this.age > 65;
    }

    public String toString() {
      return "Person(Age = " + this.age + ", Name=" + this.name + ")";
    }
  }
}
