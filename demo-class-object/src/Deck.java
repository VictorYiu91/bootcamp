public class Deck {
  // Static Variable (like Dictionary)
  public static final int[] RANKS = // static = share to all object, final = cannot change afteward
      new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
  public static final String[] SUITS =
      new String[] {"DIAMOND", "CLUB", "HEART", "SPADE"};

  // Attribute (Instance Variable) , instance = object
  private Card[] cards;

  public Deck() {
    this.cards = new Card[RANKS.length*SUITS.length]; // 0-51
    int idx = 0;
    for (String suit: SUITS) {
      for (int rank: RANKS) {
        this.cards[idx] = new Card(rank, suit);
        idx++;
      }
    }
  }
  public Card[] getCards(){
    return this.cards;
  }

  public static void main(String[] args) {
    Deck d1 = new Deck();
    System.out.println(d1.cards[7].getRank() + " & " + d1.cards[12].getSuit());
  }
}
