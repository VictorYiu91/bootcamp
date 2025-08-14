import java.math.BigDecimal;

public class Item {
  private double price;
  private int quantity;
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
  public double Subtotal() {
    return BigDecimal.valueOf(this.price).multiply(BigDecimal.valueOf(this.quantity)).doubleValue();
  }
  // method: presentation -> subtotal
  public static void main(String[] args) {
  }
}
