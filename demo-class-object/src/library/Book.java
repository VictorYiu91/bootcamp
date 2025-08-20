package library;
public class Book {
  private String name;
  private String author;
  private String bookId;

  public void setName (String name) {
    this.name = name;
  }
  public void setAuthor (String author) {
    this.author = author;
  }
  public void setBookId (String bookId) {
    this.bookId = bookId;
  }
  public String getName() {
    return this.name;
  }
  public String getAuthor() {
    return this.author;
  }
  public String getBookId() {
    return this.bookId;
  }
}
