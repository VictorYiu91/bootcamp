public class DemoString {
  public static void main(String[] args) {
    // Data Types: 8 Primitives, Class (String)
    String s1 = "hello";
    System.out.println(s1); // hello

    // length()
    System.out.println(s1.length()); // 5
    int length = s1.length();

    // equals()
    if (s1.equals("HELLO")) { // ! Java case sensitive
      System.out.println("equals");
    } else {
      System.out.println("not equals"); // print
    }

    boolean isEqualsToXXX = s1.equals("HELLO");
    System.out.println(isEqualsToXXX);

    // charAt(int index)
    System.out.println(s1.charAt(0)); // h, index = 0 means the first charcater of the string
    // print the last character of a string
    System.out.println(s1.charAt(s1.length() - 1));
    // ! index  -> out of range (system error)
    // System.out.println(s1.charAt(-1)); out of range (x >= 0)
    // System.out.println(s1.charAt(s1.length())); out range (x <= length-1)
  }
}
