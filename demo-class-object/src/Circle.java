import java.math.BigDecimal;

// ! Class Author (Circle Class)
// ! Class User (Circle Class, BigDecimal)
public class Circle {
  // attribute: raw data
  private double radius;
  // ! we won't use diameter as an attribute in Class Circle
  // because the existing attribute (radius) can derive the new attribute (diameter)

  // Method: Presentation of existing attribute
  public double getDiameter() {
    // BigDecimal
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.TWO)
        .doubleValue();
  }

  // setter, getter
  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public double getArea() {
    return BigDecimal.valueOf(this.radius) //
        .multiply(BigDecimal.valueOf(this.radius)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
  }

  public static void main(String[] args) {
    // create circle object
    // set radius 3.3
    // get radius
    // get diameter
    // get area
    Circle c1 = new Circle();
    c1.setRadius(3.3);
    System.out.println(c1.getRadius());
    System.out.println(c1.getDiameter());
    System.out.println(c1.getArea());
  }
}
