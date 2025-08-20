package inheritance;
import java.math.BigDecimal;

public abstract class Shape {
  private String color;
  // constructor, set, get

  public Shape(String color) {
    this.color = color;
  }

  abstract double area(); // ! abstract method : child class has to implement it.

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public static void main(String[] args) {
    Shape s1 = new Circle(3.5, "RED");
    Shape s2 = new Square(8.0, "BLACK");
    Shape s3 = new Square(4.0, "BLUE");

    Shape[] shapes = new Shape[] {s1, s2, s3};
    System.out.println(totalArea(shapes));
  }
  // ! Parent Class
  // Method Designer: Requires object can do something (i.e. area())
  // Method User: Use Child/Parent classes relationship implement menthod content (how to calculate area)
  public static double totalArea(Shape[] shapes) {
    BigDecimal totalArea = BigDecimal.ZERO;
    for (int i = 0; i < shapes.length; i++) {
      totalArea = totalArea.add(BigDecimal.valueOf(shapes[i].area()));
    }
    return totalArea.doubleValue();
  }
}
