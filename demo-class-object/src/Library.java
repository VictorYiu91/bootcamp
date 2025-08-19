public class Library {
  // books
  private Book[] books;

  // Librarian (per library);
  // Bookshelf (per library);

  // Constructor -> the process of creating object
  public Library() {
    this.books = new Book[0];
  }

  public void add(Book book) {
    Book[] books = new Book[this.books.length + 1];
    for (int i = 0; i < this.books.length; i++) {
      books[i] = this.books[i];
    }


  }

  private void remove(int index) {}


  public static void main(String[] args) {
    // new Library, Book, Book[], Libarian, Bookshelf
    // get and print
  }
}
