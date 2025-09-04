import java.util.Stack;

public class DemoStack {
  public static void main(String[] args) {
    Stack<String> names = new Stack<>();
    names.push("John");
    names.push("Steven");
    names.push("Leo");
    System.out.println(names.size());
    System.out.println(names.contains("Steven"));
    System.out.println(names.get(1));
    // Stack -> LAST IN FIRST OUT
    System.out.println(names.peek()); 
    
    while (!names.isEmpty()) {
      System.out.println(names.pop());
    }
  }
}
