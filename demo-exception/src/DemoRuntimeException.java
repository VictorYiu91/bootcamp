public class DemoRuntimeException {
  public static void main(String[] args) {
    // ! avoidable exception (Bug)
    // 1. NPE (Null Pointer Exception)
    // String s = null;
    // System.out.println(s);

    // 2. ArrayIndexOutOfBounds
    // int[] arr = new int[3];
    // System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException

    // 3. ArithmeticException
    // int count = 0;
    // int average = 10/count; // java.lang.ArithmeticException: / by zero

    // 4. StringIndexOutOfBounds
    // System.out.println("hello".charAt(5)); // java.lang.StringIndexOutOfBoundsException

    // ! unavoidable exception
    // 5. Method throw exception
    // String input = null;
    // getLength(input);
    // Solution for method caller: 1. try-catch IllegalArgumentException 2. if input !=null

    // 6. Type Conversion (e.g. String to Integer)
    // String number = "3!";
    // System.out.println(Integer.valueOf(number)); // java.lang.NumberFormatException
    // Solution for method caller: try-catch NumberFormatException

    // 7. Scenerio: Login (e.g. Database)
    // Username or Password is wrong. -> IOException

    // 8. Scenerio: Find a specific file name in a folder -> FileNotFoundException

    

  }

  public static int getLength(String s) {
    if (s != null)
      return s.length();
    throw new IllegalArgumentException("s should not be null.");
  }
}
