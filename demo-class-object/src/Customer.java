// HKTVMALL

import java.math.BigDecimal;

public class Customer {
  private Order[] orders;

  // constructor
  public Customer() {
    this.orders = new Order[0];
  }
  // get/set

  public void add(Order newOrder) {
    Order[] orders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      orders[i] = this.orders[i];
    }
    orders[orders.length - 1] = newOrder;
    this.orders = orders;
  }
  // method presentation -> totalPurchaseAmount()
  public double totalPurchaseAmount() {
    BigDecimal sum = BigDecimal.ZERO;
    for (Order order: this.orders) {
      sum = sum.add(BigDecimal.valueOf(order.total()));
    }
    return sum.doubleValue();
  }

  // method presentation -> isVip () , totalPurchaseAmount > 100_000
  public boolean isVip() {
    return this.totalPurchaseAmount() > 100_000;
  }
  public static void main(String[] args) {
    //Customer A, Order A & B
    //Customer B, Order C

    // and with some items

    // Customer A -> isVip -> true
    // Customer B -> isVip -> false
    

  }
}

