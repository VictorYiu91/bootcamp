// ! One to Many

import java.util.Arrays;

public class Order {
  private Item[] items;
  // set/get
  public void setItems(Item[] items) {
    this.items = items;
  }
  public Item[] getItems() {
    return this.items;
  }
  public void add(Item item) {
    // item[] length x
    // item[] length x + 1
  }

  // method presentation-> total


  public static void main(String[] args) {
    Item apple = new Item();
    Item banana = new Item();
    Item orange = new Item();
    apple.setPrice(5.5);
    apple.setQuantity(6);
    banana.setPrice(7.8);
    banana.setQuantity(5);

    Item[] items = new Item[2];
    items[0] = apple;
    items[1] = banana;

    Order order1 = new Order();
    order1.setItems(items);

    System.out.println(order1.getItems()[0].Subtotal());
  }
}
