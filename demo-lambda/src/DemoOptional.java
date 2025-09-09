import java.time.LocalDate;
import java.util.Optional;

public class DemoOptional {
  public static final String[] names = new String[] {"John", "Lucas", "Jason"};
  public static final Book[] books = new Book[] { //
      new Book(LocalDate.of(2020, 10, 20), "ABC") //
      , new Book(LocalDate.of(2021, 1, 1), "DEF") //
      , new Book(LocalDate.of(1999, 12, 31), "IJK") //
  };

  public static class Book {
    private LocalDate publishDate;
    private String name;

    public Book(LocalDate publishDate, String name) {
      this.name = name;
      this.publishDate = publishDate;
    }

    public String getName() {
      return this.name;
    }

    public LocalDate getPublishDate() {
      return this.publishDate;
    }

    @Override
    public String toString() {
      return "Book(" //
          + "publishDate=" + this.publishDate //
          + ", name=" + this.name //
          + ")";
    }
  }

  public static void main(String[] args) {
    // System.out.println(concat(null,"world")); // caller

    // ! Return Type -> Optional -> Searching
    // ! Return Type -> Optional -> Searching
    System.out.println(findByBookName2("IJK"));
    Optional<Book> targetBook = findByBookName2("OPQ");
    if (targetBook.isPresent()) {
      System.out.println("Book=" + targetBook.get());
    } else { // empty
      System.out.println("Book is not found.");
    }

    Optional<Book> targetBook2 =
        findBookByPublishDate(LocalDate.of(2020, 1, 1));
    if (targetBook2.isPresent()) {
      System.out.println("Book=" + targetBook2.get());
    } else { // empty
      System.out.println("Book is not found.");
    }

        // ! Declare Optional (of, empty, ofNullable)
    Book b1 = null;
    // Optional.of(b1); // ! error, of() cannot serve for null value
    Optional.ofNullable(b1); // OK, ofNullable() allows null or non-null value
    Optional<Book> b2 = Optional.empty();

    // ! isPresent() -> boolean, if true -> get(), false -> another flow
    // ! ifPresent() -> handle "true" flow only. Use the element directly, without get()
    findByBookName2("ABC").ifPresent(e -> {
      System.out.println(e.getPublishDate());
      System.out.println(e.getName());
    });

    // ! get the value from Optional Object:
    // 1. get() (after isPresent())
    // 2. orElse()
    Book targetBook3 = findByBookName2("MNO").orElse(null);
    Book targetBook4 = findByBookName2("MNO")
        .orElse(new Book(LocalDate.of(1970, 1, 1), "DEFAULT"));
    Book targetBook5 = findByBookName2("MNO")
        .orElseThrow(() -> new RuntimeException("Book not found."));
  }

  public static String concat(String s1, String s2) {
    if (s1 == null || s2 == null) {
      throw new IllegalArgumentException("s1 & s2 should not be null.");
    }
    return s1.concat(s2);
  }

  // Searching
  public static boolean findName(String targetName) {
    if (targetName == null)
      return false;
    for (String n : names) {
      if (targetName.equals(n))
        return true;
    }
    return false;
  }

  // Serching Book name (contains characters...)
  public static Book findByBookName(String name) {
    if (name == null)
      throw new IllegalArgumentException("Wrong Book Name.");
    for (Book b : books) {
      if (name.equals(b.getName()))
        return b;
    }
    return null; // ! Not Found. But we don't treat it as System Error.
  }

  // Java 8: Optional (Not Found -> Null)
  public static Optional<Book> findByBookName2(String name) {
    if (name == null)
      throw new IllegalArgumentException("Wrong Book Name.");
    for (Book b : books) {
      if (name.equals(b.getName()))
        return Optional.of(b); // Optional Object
    }
    return Optional.empty(); // Optional Object
  }

  // Optional<Book>
  // Find a book with puslish Date after 2020.
  public static Optional<Book> findBookByPublishDate(LocalDate publishDate) {
    if (publishDate == null)
      throw new IllegalArgumentException("Wrong Target Date.");
    for (Book b : books) {
      if (publishDate.equals(b.getPublishDate())
          || publishDate.isBefore(b.getPublishDate())) {
        return Optional.of(b); // Optional Object
      }
    }
    return Optional.empty(); // Optional Object
  }
}
