import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class DemoTypeinference {
  // ! Can't Do
  // private var age;

  // ! Can't Do
  //public static var getLength(String x) {
  //  return x.legnth();
  //}

  // ! Can't Do
  //public static int getLength(var x) {
  //  return x.length();
  //}

  public static void main(String[] args) {
    int x = 3;
    var y = 4;
    // Java is Strong & Static
    // ! Static -> compile time -> confirm variable type.
    // y = "hello"; // y default as int at the begining -> cannot convert to String

    Map<String, Integer> map = new HashMap<>();
    map.put("John",18);
    map.put("Mary",23);
    for (Map.Entry<String,Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + ", " + entry.getValue());
    }
    for (var entry: map.entrySet()){
      System.out.println(entry.getKey() + ", " + entry.getValue());
    }

    var bird = new Bird();
    var arr = new int[] {1 ,2 ,3};
    // ! Can't Do
    // var n;
    // var n = null;
    
    // var sortByDesc = (i1, i2) -> i1 > i2 ? -1 : 1; // Lambda required confirmation that Interface is used.
    Comparator<Integer> sortByDesc = (i1,i2) -> i1 > i2 ? -1 : 1;
  }
}
