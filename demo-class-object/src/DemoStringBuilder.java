public class DemoStringBuilder {
  public static void main(String[] args) {
    // Good Performance
    StringBuilder sb = new StringBuilder("");
    sb.append("a"); // similar to setter
    sb.append("b"); // similar to setter
    System.out.println(sb.toString()); //ab

    String str = "";
    String str2 = str + "a"; // return a new object
    String str3 = str + "b"; // return a new object
    System.out.println(str3); // ab

    String url = "https://";
    url = url + "www.apple.com";

    long before = System.currentTimeMillis(); // get the current time in long value
    String s1 = "";
    for (int i = 0; i < 10000; i++) {
      s1 = s1 + 'a';
    }

    long after = System.currentTimeMillis(); // get the current time in long value
    System.out.println("s1 result=" + (after - before)); // 27ms

    before = System.currentTimeMillis(); // get the current time in long value
    StringBuilder s2 = new StringBuilder("");
    for (int i = 0; i < 10000; i++) {
      s2.append("a");
    }
    after = System.currentTimeMillis(); // get the current time in long value
    System.out.println("s2 result=" + (after - before)); // 1ms much faster!!
  } 
}
