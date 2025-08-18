public class Card {
  private int rank; // 1 - 13
  private String suit; // "DIAMOND", "SPADE", "HEART", "CLUB"

  // empty constructor -> useless in this case
  // public Card {
  // }
  // All arguments constructor
  public Card(int rank, String suit) {
    this.rank = rank;
    this.suit = suit;
  }
  // No setter -> as we dont plan to change the object attribute afterward.
  // we use the default setting in the constructor

  // getters
  public int getRank() {
    return this.rank;
  }

  public String getSuit() {
    return this.suit;
  }

  public static void main(String[] args) {
    // new Card();
    new Card(1, "SPADE");
  }
}
