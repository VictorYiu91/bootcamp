import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DemoHashMap {
  public static void main(String[] args) {
    // String (Student ID) -> String (Student Name)
    // Solution 1: List<Student>
    // Solution 2: List<Str<ing>, List<String>

    // Searching -> HashMap
    // <String, <-- key | String> <-- value
    HashMap<String, String> studentMap = new HashMap<>();
    studentMap.put("s1234", "John"); // put an entry into a map
    studentMap.put("s7890", "Alex"); // put an entry into a map
    System.out.println(studentMap.get("s7890")); // Alex <- entry's value

    List<Cat> cats = new ArrayList<>();
    cats.add(new Cat("Leo", 3));
    cats.add(new Cat("Steven", 4));
    cats.add(new Cat("Oscar", 4));

    HashMap<String, Cat> catMap = new HashMap<>();
    for (Cat cat : cats) {
      catMap.put(cat.getName(), cat);
    }
    System.out.println(catMap.get("Steven"));

    // ! If the Key type is String / Wrapper Class, you don't need rewrite equals()

    List<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog("Leo", 3));
    dogs.add(new Dog("Steven", 4));
    dogs.add(new Dog("Oscar", 4));
    HashMap<Dog, String> dogMap = new HashMap<>(); // "Leo and 3"
    for (Dog dog : dogs) {
      dogMap.put(dog, dog.getName() + " and " + dog.getAge());
    }
    System.out.println(dogMap.get(new Dog("Oscar",4))); // "Oscar and 4" , because override hashCode and equals()
  }
}
