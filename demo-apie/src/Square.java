import java.math.BigDecimal;

public class Square extends Shape {
  private double side;

  public Square(double side, String color) {
    super(color);
    this.side = side;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.side) //
        .multiply(BigDecimal.valueOf(this.side)) //
        .doubleValue();
  }

  public void setSide(double side) {
    this.side = side;
  }

  public double getSide() {
    return this.side;
  }
}
