import java.util.ArrayList;

public class DemoArrayList {
  public static void main(String[] args) {
    String[] names = new String[] {"Alex","Jessies","Jennie"};
    for (String name: names) {
      System.out.println(name);
    }
    // ! Disadvanatage of array
    // 1. We need to re-create a new array when additional element is required.
    // 2. Modify element: search element one by one, and then replace it.
    // Solution: ArrayList
    ArrayList<String> emails = new ArrayList<String>();
    emails.add("abc@gmail.com");
    // emails = new Arraylist<Integer>();
    // ! ArrayList of String has no relationship with ArrayList of Integer
    // ! ArrayList of Long has no relationship with ArrayList of Integer 
    // ! In concluded, the reference type of arraylist must be same as the object type of the arraylist.
    // ! So, after Java5+, Java allow implicitly align reference type and obejct type for arraylist.
    ArrayList<String> bookNames = new ArrayList<>();
    bookNames.add("ABC");
    bookNames.add("DEF");
    bookNames.add("IJK");
    for (String bookName: bookNames) {
      System.out.println(bookName);
    }
    bookNames.remove(1);
    System.out.println(bookNames); // ArrayList.class -> method: toString()

    // count the number of bookNames starting with "A".
    int count = 0;
    for (String bookName: bookNames) {
      if (bookName.startsWith("A")) count++;
    } System.out.println(count);
    // ! ArrayList is in order, because the underlying data structure is an array.
    bookNames.add("MNO");
    System.out.println(bookNames); // MNO will be the last element.
    bookNames.addFirst("OPQ"); 
    System.out.println(bookNames); // OPQ will be the first element.
    System.out.println(bookNames.contains("OPQ"));
    System.out.println(bookNames.isEmpty());
    // bookNames = null; // Null pointer, not same as Empty
    System.out.println(bookNames.size()); // sames as array length
    bookNames.set(1,"BCD");
    System.out.println(bookNames); // replacing ABC to BCD
    System.out.println(bookNames.get(2)); // get the third element
    bookNames.clear();
    System.out.println(bookNames.size()); // 0
    System.out.println(bookNames); // []
    
    // ! Basic ArrayList methods: add, remove, isEmpty, size, contains, get, set

    // ! We cannot put primitive into ArrayList.
    // ArrayList<int>
    ArrayList<Integer> integers = new ArrayList<>(); // That's why we need Wrapper Class
    integers.add(1);

    // ArrayList<Cat>
    // loop cat.getName()
    // 1. Create Cat.class
    ArrayList<Cat> cats = new ArrayList<>();
    Cat c1 = new Cat("John",1);
    cats.add(c1);
    c1.setName("Peter");
    cats.add(new Cat("Leo",2));

    for (Cat cat: cats) {
      System.out.println(cat.getName());
    }




  }
}
