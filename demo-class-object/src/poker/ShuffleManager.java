package poker;
import java.util.Arrays;
import java.util.Random;

public class ShuffleManager {
  private Card[] cards;

  public ShuffleManager(Card[] cards) {
    this.cards = cards;
  }

  public Card[] shuffle(int times) {
    // ... this.cards
    // random 0-51;
    if (times < 0) {
      return this.cards;
    }
    for (int i = 0; i < times; i++) {
      Card[] shuffledCards = new Card[this.cards.length];
      int r1 = new Random().nextInt(26); // (0-25) // assume 17
      int r2 = new Random().nextInt(26) + 26; // (0-25)+26 -> 26-51 // assume 23
      for (int j = r1; j < r2; j++) { // 17 -22
        shuffledCards[j-r1] = this.cards[j];
      }
      for (int j = 0; j < r1; j++) { // 0-16
        shuffledCards[r2 - r1 + j] = this.cards[j];
      }
      for (int j = r2; j < this.cards.length ; j++) { // 23-51
        shuffledCards[j] = this.cards[j];
      }
      this.cards = shuffledCards;
    }
    return this.cards;
  }

  public static void main(String[] args) {
    Deck d1 = new Deck();
    // chain method:
    Card[] cardsAfterShuffle = new ShuffleManager(d1.getCards()).shuffle(2000);
    System.out.println(Arrays.toString(cardsAfterShuffle));
  }
}
