package generic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
  abstract double area();

  public static double totalArea(List<Shape> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    for (Shape s: shapes) {
      total = total.add(BigDecimal.valueOf(s.area()));
    } return total.doubleValue();
  } 

  public static <T extends Shape> double totalArea2(List<T> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    for (Shape s: shapes) {
      total = total.add(BigDecimal.valueOf(s.area()));
    } return total.doubleValue();
  }

  public static void main(String[] args) {
    List<Circle> circles = new ArrayList<>();
    circles.add(new Circle(3));
    circles.add(new Circle(4));
    // totalArea(circles); // ! error, because List<Shape> has no relationship with List<Circle>
    System.out.println(totalArea2(circles));
  }
}
