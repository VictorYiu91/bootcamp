package enum1;

public class DemoRecursion {
  public static int sum(int x, int y) {
    return x + y;
  }

  public static int sum(int value) {
    if (value == 1) // Exit Criteria
      return 1;
    return value + sum(value - 1); // Call self with pattern
    // 10 + sum(9)
    // 9 + sum(8)
    // ...
    // 2 + sum(1)
  }

  public static int multiplyEven(int value) {
    if (value < 2)
      return 0;
    return value % 2 == 1 ? multiplyEven2(value - 1) : multiplyEven2(value);
  }

  public static int multiplyEven2(int value) {
    if (value <= 2)
      return 2;
    return value * multiplyEven2(value - 2);
  }

  public static void main(String[] args) {

    System.out.println(sum(5, 10));
    System.out.println(sum(20));

    // input n = 10
    // 10 * 8 * 6 * 4 * 2

    System.out.println(multiplyEven(12));
  }
}
