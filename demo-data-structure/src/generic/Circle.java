package generic;

import java.math.BigDecimal;

public class Circle extends Shape{
  private int raduis;
  public Circle (int radius) {
    this.raduis = radius;
  }
  public int getRadius(){
    return this.raduis;
  }
  @Override
  public double area() {
    return this.raduis * this.raduis * 3.14;
  }
}
