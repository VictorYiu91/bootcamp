public class DemoString {
  public static void main(String[] args) {
    // Data Types: 8 Primitives, Class (String)
    String s1 = "hello";
    System.out.println(s1); // hello

    // length()
    System.out.println(s1.length()); // 5
    int length = s1.length();
    System.out.println("".length()); // 0, "" empty String still a legal String value

    // equals()
    if (s1.equals("HELLO")) { // ! Java case sensitive
      System.out.println("equals");
    } else {
      System.out.println("not equals"); // print
    }

    boolean isEqualsToXXX = s1.equals("HELLO");
    System.out.println(isEqualsToXXX); // false

    // charAt(int index)
    System.out.println(s1.charAt(0)); // h, index = 0 means the first charcater of the string
    // print the last character of a string
    System.out.println(s1.charAt(s1.length() - 1)); // o
    // ! index  -> out of range (system error)
    // System.out.println(s1.charAt(-1)); out of range (x >= 0)
    // System.out.println(s1.charAt(s1.length())); out range (x <= length-1)

    // contains()
    System.out.println("apple".contains("ap")); // true
    System.out.println("apple".contains("pa")); // false
    System.out.println("apple".contains("AP")); // false
    System.out.println("apple".contains("apple")); // true
    System.out.println("apple".contains("apple2")); // false
    
    // indexOf() / lastIndexOf() : input char, output index
    System.out.println("halo".indexOf('l')); // 2, index starting from 0
    System.out.println("hello".indexOf('l')); // 2, the index of first character
    System.out.println("halo".indexOf('b')); // -1, no this character
    System.out.println("hello world".indexOf("llo")); // 2, similar to contains()
    System.out.println("xxxyyyzzz".lastIndexOf('x')); // 2, the last 'x' is the third character
    System.out.println("halo".lastIndexOf('x')); // -1, no this character
    System.out.println("banana".lastIndexOf("na")); // 4, the last combination of "na" starts at the fifth character

    // equalsIgnoreCase()
    System.out.println("apple".equals("apple")); // true
    System.out.println("apple".equals("Apple")); // false
    System.out.println("apple".equalsIgnoreCase("Apple")); // true
    System.out.println("apple".equalsIgnoreCase("Apple ")); // false
    System.out.println("apple".equalsIgnoreCase("appl")); // false

    // toUpperCase() / toLowerCase()
    System.out.println("apple".toUpperCase()); // APPLE
    System.out.println("Apple".toLowerCase()); // apple

    // startsWith() / endsWith()
    System.out.println("apple".startsWith("a")); // true
    System.out.println("apple".startsWith("app")); // true
    System.out.println("apple".startsWith("A")); // false (Case senstive)
    System.out.println("apple".endsWith("le")); //true
    System.out.println("apple".endsWith("E")); // false (Case senstive)

    // check if a strinng endswith le or LE
    String s2 = "appLe";

    // chain method
    System.out.println(s2.toUpperCase().endsWith("LE")); // true
    System.out.println(s2.endsWith("le")||s2.endsWith("LE")); // false
    
    Boolean result = s2.endsWith("le")||s2.endsWith("LE");
    System.out.println(result); // false

    // concat()
    System.out.println("hello".concat("world")); // helloworld
    String s3 = "apple";
    // Both String value and String variable can use methods
    System.out.println(s3.concat("!!!")); // apple!!!
    System.out.println(s3); // apple (didn't affect String value even we use method before)
    // chain method
    System.out.println(s3.concat("banana").length()); // 11
    System.out.println(s3.concat("lemon").equals("applelemon")); // true

    // replace()
    String s4 = "banana";
    String result2 = s4.replace('a','x');
    System.out.println(s4); // banana
    System.out.println(result2); // bxnxnx
    System.out.println(s4.replace("an", "ijk")); // bijkijka
    // remove 'a'
    System.out.println(s4.replace("a","")); // bnn

    // isEmpty() / isBlank()
    System.out.println("apple".isEmpty()); // false
    System.out.println("".isEmpty()); // trur
    
    String s5 = null; //null value
    String s6 = ""; // empty String value
    // System.out.println(s5.length()); <- System Error
    System.out.println(s6.length()); // 0
    String s7 = "      ";
    System.out.println(s7.length()); // 6
    System.out.println(s7.isEmpty()); // false
    System.out.println(s7.isBlank()); // true
    String s8 = "";
    System.out.println(s8.isEmpty()); // true
    System.out.println(s8.isBlank()); // true

  }
}
