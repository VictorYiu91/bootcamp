// ! During compile-time, the way to ensure a object comply with a contract (with method)

import java.util.PriorityQueue;
import java.util.Queue;

public class Book implements Comparable<Book> { // ! method, input: String, output: int
  private String name;
  public Book(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  // compareTo() -> ordering logic of Book
  // 2 Objects here: this (Book object) and book (another Book object)
  @Override
  public int compareTo(Book book) { // ! The definition of ordering of Book
    // return this.name.compareTo(book.getName()); // ! ascending order
    // ! desceinding order
    return book.getName().compareTo(this.name);
  }

  public static int compare(Book b1, Book b2) {
    return b1.compareTo(b2);
  }

  @Override
  public String toString() {
    return "Book(" //
    +"name = " + this.name //
    + ")";
  }
  public static void main(String[] args) {
    System.out.println("abc".compareTo("ccd")); // -2
    System.out.println("abc".compareTo("abc")); // 0
    System.out.println("bbc".compareTo("abc")); // 1
    System.out.println("bbc".compareTo("bbc")); // -1

    int result = compare(new Book("DEF"), new Book("ABC"));
    System.out.println(result); // 3

    Queue<Book> bq = new PriorityQueue<>();
    bq.add(new Book("IJK"));
    bq.add(new Book("ABC"));
    bq.add(new Book("XYZ"));
    bq.add(new Book("MNO"));
    while (!bq.isEmpty()) {
      System.out.println(bq.poll()); //poll() -> compareTo()
    }
  }
}
