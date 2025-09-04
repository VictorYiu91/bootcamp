// ! Unchecked Exception -> Compile time -> allow exists
// ! Checked Exception -> Compile time -> handle/fix
public class DemoCheckedException {
  public static void main(String[] args) {
    try {
      total(null); // java.lang.NullPointerException
    } catch (InvalidParameterException e) {

    }


  }

  // RuntimeException (IllegalArgumentException):
  // 1. method caller can ignore RuntimeException.(By try-catch)
  // 2. method author don't need to add Exception into method signature
  
  // Exception (InvalidParameterException)
  // 1. method caller has to try-catch
  // 2. method author need to add Exception into method signature
  public static int total(int[] arr) throws InvalidParameterException {
    if (arr == null)
      throw new IllegalArgumentException("array is null."); // ! RuntimeException (Unchecked Exception)
    int total = 0;
    for (int x : arr) {
      total += x;
    }
    return total;
  }
}