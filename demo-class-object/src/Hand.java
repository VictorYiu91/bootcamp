import java.util.Arrays;

public class Hand {
  private Card[] cards;

  private Hand() {
    this.cards = new Card[5];
  }

  public Hand(Card c1, Card c2, Card c3, Card c4, Card c5) {
    this.cards = new Card[] {c1, c2, c3, c4, c5};
  }

  public boolean isFullHouse() {
    if (this.cards.length !=5) return false;
    int[] rankCount = new int[13];
    for (int i = 0; i < cards.length; i++) {
      rankCount[cards[i].getRank() - 1]++; 
    }
    int countZero = 0;
    int countThree = 0;
    int countTwo =0;
    for (int i =0; i < rankCount.length; i++) {
      if (rankCount[i] == 0) countZero++;
      if (rankCount[i] == 2) countTwo++;
      if (rankCount[i] == 3) countThree++;
    }
    return countZero == 11 && countThree == 1 && countTwo == 1;
  }

  public void add(Card card) {

  }

  public static void main(String[] args) {
  }
}
