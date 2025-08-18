public class ShuffleManager {
  private Card[] cards;
  public ShuffleManager(Card[] cards) {
    this.cards = cards;
  }
  public void shuffle(int times) {
    // ... this.cards
    // random 0-51;
    Card[] shuffledCards = new Card [this.cards.length];
    for (int i = 0; i < times ; i++) {
      for (int j = 0; j < this.cards.length; j++) {
        int randomNum = (int)(Math.random()*51);
        
      }
    }
  }
  public static void main(String[] args) {
    Deck d1 = new Deck();
    ShuffleManager sm = new ShuffleManager(d1.getCards());
    sm.shuffle(2);

    d1.getCards();
  }
}
