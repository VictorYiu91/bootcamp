import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    double result = 0.1 + 0.2;
    System.out.println(result); // 0.300000000
    if (result == 3.0) {
      System.out.println("Result=3.0");
    } else {
      System.out.println("Result!=3.0");
    }

    //Solution : BigDecimal
    // + add()
    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = new BigDecimal("0.2");
    BigDecimal bd3 = bd1.add(bd2);
    System.out.println(bd3.doubleValue()); // 0.3

    BigDecimal bd4 = BigDecimal.valueOf(0.1);
    BigDecimal bd5 = BigDecimal.valueOf(0.2);
    BigDecimal bd6 = bd4.add(bd5);
    System.out.println(bd6.doubleValue()); // 0.3
    
    // - subtract()
    BigDecimal bd7 = BigDecimal.valueOf(0.7);
    BigDecimal bd8 = BigDecimal.valueOf(0.3);
    BigDecimal bd9 = bd7.subtract(bd8);
    System.out.println(bd9.doubleValue()); // 0.4

    // * multiply()
    BigDecimal bd10 = BigDecimal.valueOf(0.6);
    BigDecimal bd11 = BigDecimal.valueOf(0.4);
    BigDecimal bd12 = bd10.multiply(bd11);
    System.out.println(bd12.doubleValue()); // 0.24

    // / divide(),
    BigDecimal bd13 = BigDecimal.valueOf(0.18);
    BigDecimal bd14 = BigDecimal.valueOf(0.03);
    BigDecimal bd15 = bd13.divide(bd14);
    System.out.println(bd15.doubleValue()); // 6.0
    // -> non-terminating decimal, rounding e.g. 10/3
    // HALF_UP -> 0.5 or above, round up
    // HALF_DOWN -> 0.5 or below, round down
    System.out.println(BigDecimal. valueOf(10).divide(BigDecimal.valueOf(3), 2, RoundingMode.HALF_UP));
  }
}
