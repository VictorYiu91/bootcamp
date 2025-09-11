import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoArrayList2 {
  public static void main(String[] args) {
    // Given elements in ArrayList
    List<String> names = Arrays.asList("John", "Mary", "Susan"); // create ArrayList Object
    System.out.println(names);

    List<String> names2 = List.of("John", "Mary", "Susan"); // ! Java 9: List.of()
    System.out.println(names2);

    List<String> names3 =
        new ArrayList<>(Arrays.asList("John", "Mary", "Susan"));
    System.out.println(names3);

    // names.add("Lucas"); // java.lang.UnsupportedOperationException
    // names2.add("Lucas"); // java.lang.UnsupportedOperationException
    names3.add("Lucas");
    System.out.println(names3);

    System.out.println(names.get(0));
    System.out.println(names2.get(0));

    // ! Array.asList() vs List.of()
    // 1. add & remove are not allowed
    // 2. Arrays.asList() -> able to modify element (i.e. set() method), but List.of() cannot.
    names.set(2, "Sally");
    System.out.println(names);
    // names2.set(2, "Sally"); // java.lang.UnsupportedOperationException
  }

  // array -> ArrayList (i.e. Arrays.asList(arr))
  public static List<Integer> findOddNumbers(Integer[] arr) {
    // Array.asList + Stream
    return Arrays.asList(arr).stream() //
    .filter(e -> e % 2 != 0) //
    .collect(Collectors.toList());


  }
}
