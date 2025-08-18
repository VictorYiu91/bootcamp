import java.math.BigDecimal;

public class Item {
  private double price;
  private int quantity;

  // ! Constructor
  // ! By default, Java Class contains empty constructor (implicitly exists)
  // 1. Contructor has NO return type
  // 2. Class Name
  public Item() { // ! empty constructor : No input parameter

  }

  // set/get
  public void setPrice (double price) {
    this.price = price;
  }
  public void setQuantity (int quantity) {
    this.quantity = quantity;
  }
  public double getPrice() {
    return this.price;
  }
  public int getQuantity() {
    return this.quantity;
  }
  public double subtotal() {
    return BigDecimal.valueOf(this.price).multiply(BigDecimal.valueOf(this.quantity)).doubleValue();
  }
  // method: presentation -> subtotal
  public static void main(String[] args) {
    // ! "new" is calling constructor "Item()"
    Item i1 = new Item();
  }
}
