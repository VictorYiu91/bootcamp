import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String> names = new HashSet<>();
    names.add("John");
    names.add("Leo");
    System.out.println(names.size());
    System.out.println(names.isEmpty());
    System.out.println(names.contains("Leo"));
    System.out.println(names);

    for (String name: names) {
      System.out.println(name);
    }
    names.remove("Leo");
    names.remove(new String ("John"));
    System.out.println(names.size()); // 0

    // ! HashSet vs ArrayList
    // ! 1. Disallow duplicated
    names.add("Oscar");
    names.add("Jacky");
    names.add("Oscar"); // duplicated
    names.add("oscar");
    names.add("April");
    System.out.println(names.size()); // 3, because HashSet disallow duplicated object automatically.
    // Reason: HashSet.add() -> object.equals() <- String.equals()

    // ! 2. ("Hash" <- No Ordering) 
    System.out.println(names); // [oscar, Jacky, April, Oscar]

    // ArrayList<Hero> heros
    // Object.class -> equals() -> checking "=="
    // hero.remove(new Hero("leo1234"));

    // ! Important Point for both ArrayList and HashSet -> Override equals() for Object
    ArrayList<Cat> cats = new ArrayList<>();
    Cat c1 = new Cat("Kelly",1);
    cats.add(c1);
    cats.add(new Cat("Sue",2));
    Cat c3 = new Cat("Kelly",1);
    cats.add(c3);
    System.out.println(cats.size()); // 3

    cats.remove(new Cat("Kelly",1)); // Remove Fail, missing equals() in Cat.class
    System.out.println(cats.size()); // 3

    cats.remove(c1);
    cats.remove(c3); // it works, because it is calling Object.equals().
    System.out.println(cats.size()); // 1
    // correct solution: rewrite equals() in Cat.class

    // Question 1: Remove duplicates by HashSet
    ArrayList<String> emails = new ArrayList<>();
    emails.add("leo123@gmail.com");
    emails.add("lucas234@gmail.com");
    emails.add("leo123@gmail.com");

    HashSet<String> emailsHashSet = new HashSet<>();
    for (String email: emails) {
      emailsHashSet.add(email);
      System.out.println(emailsHashSet);
    } 

    // Question 2: Construct a HashMap (at least 2 entries)
    HashMap<String, ArrayList<Dog>> doglistMap = new HashMap <>();
    ArrayList<Dog> dogList1 = new ArrayList<>();
    dogList1.add(new Dog(("Bobo"),3));
    dogList1.add(new Dog(("Jojo"),4));
    ArrayList<Dog> dogList2 = new ArrayList<>();
    dogList2.add(new Dog(("Momo"),2));
    dogList2.add(new Dog(("Yoyo"),4));
    doglistMap.put("Team A", dogList1);
    doglistMap.put("Team B", dogList2);
    System.out.println(doglistMap.get("Team A"));
    System.out.println(doglistMap.get("Team B"));


    // Question 3: Convert Cat Array into Cat ArrayList, then print out all Names
    Cat[] catsArray = new Cat[] {new Cat("Kelly",3), new Cat("Oscar", 10)};
    ArrayList<Cat> catsArrayList = new ArrayList<>();
    for (Cat cat: catsArray) {
      catsArrayList.add(cat);
      System.out.println(cat.getName());
    } System.out.println(catsArrayList);

  }
}
