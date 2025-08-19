import java.math.BigDecimal;

public class DemoMethodSignature {
  public static double sum(int x, int y) {
    return x + y;
  }

  public static double sum(double x, double y) {
    return x + y;
  }

  // public static double sum (double a, double b) {
  // return x + y;
  // }
  public static BigDecimal sum2(double x, double y) {
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y));
  }
}
