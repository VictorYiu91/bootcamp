import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoLinkedList {
  public static void main(String[] args) {
    // Lucas -> Leo -> Sue -> Jennie -> Mary
    Person p1 = new Person("Lucas", new Person("Leo",
        new Person("Sue", new Person("Jennie", new Person("Mary", null)))));

    System.out.println(p1.getPerson().getPerson().getPerson().getName()); // Jennie;

    // Use loop to count the number of persons
    int count = 0;
    Person head = p1;
    while (head != null) {
      head = head.getPerson();
      count++;
    }
    System.out.println(count);

    // List
    List<Person2> personsList = new LinkedList<>();
    personsList.add(new Person2("Lucas"));
    personsList.add(new Person2("Leo"));
    personsList.add(new Person2("Sue"));
    personsList.add(new Person2("Jennie"));
    personsList.add(new Person2("Mary"));
    System.out.println(personsList);
    System.out.println(personsList.get(2).getName()); // Sue (For-loop)
    System.out.println(personsList.size()); // 5 (For-loop)
    System.out.println(getFirstPerson(personsList).getName());

    personsList = new ArrayList<>();

    // Shape -> Circle/Square
    List<Shape> shapes = new ArrayList<>();
    shapes.add(new Square(5.0));
    shapes.add(new Circle(6.0));
    shapes.add(new Square(8.0));
    shapes.add(new Circle(9.5));
    shapes.add(new Circle(8.8));
    System.out.println(totalArea(shapes));

    // ! Queue / Deque
    // Queue = "MUST BE" First in First out
    Queue<String> names = new LinkedList<>(); // ! LinkedList or ArrayDeque
    names.add("John");
    names.add("Leo");
    names.add("Lucas");
    System.out.println(names); // [John, Leo, Lucas]
    System.out.println(names.poll()); // John
    System.out.println(names); // [Leo, Lucas]
    System.out.println(names.size()); // 2
    System.out.println(names.isEmpty()); // false
    

    // XX Queue is not for loop
    for (String name: names) {
      System.out.println(name);
    }
    // Queue is for consume
    while (!names.isEmpty()) {
      System.out.println(names.poll());
    }
    //names.remove(); <- simliar to poll

    // ! Deque "CAN" FIFO, FILO, etc.
    Deque<String> nameDeque = new LinkedList<>(); // ! ArrayDeque or LinkedList
    nameDeque.add("Vincent");
    nameDeque.add("Steven");
    nameDeque.add("Tracy"); // add to Tail
    nameDeque.addFirst("Kelly");
    nameDeque.addLast("Tommy");
    System.out.println(nameDeque);
    nameDeque.poll(); // remove head
    System.out.println(nameDeque); // [Vincent, Steven, Tracy, Tommy]
    nameDeque.pollLast(); 
    System.out.println(nameDeque); // [Vincent, Steven, Tracy]
    System.out.println(nameDeque.peek()); // Vincent, lookup or get head without remove the head
    System.out.println(nameDeque.peekLast()); // Tracy, lookup or get head without remove the tail

    while (!nameDeque.isEmpty()) {
      System.out.println(nameDeque.poll());
    }
  }

  // get the head of list, if not found, return null
  public static Person2 getFirstPerson(List<Person2> persons) {
    if (persons == null || persons.size() == 0)
      return null;
    return persons.get(0);
  }

  // static method: List<Shape> -> Calculate total area
  public static double totalArea(List<Shape> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    for (Shape shape: shapes) {
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();
  }
}
