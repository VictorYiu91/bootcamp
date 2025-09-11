import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {
  public static void main(String[] args) {
    // Java 8
    // ! Example 1
    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Alex");
    names.add("Sally");
    names.forEach(e -> System.out.println(e)); // ! lambda
    // Consumer by lambda: e -> System.out.println(e)
    names.forEach(System.out::println);
    // Consumer by method reference: System.out::println

    // ! Example 2
    String name = "John";
    Supplier<Integer> nameLength = () -> name.length(); // lambda
    Supplier<Integer> nameLength2 = name::length; // method reference
    System.out.println(nameLength.get());
    System.out.println(nameLength2.get());

    Supplier<Bird> birdSupplier = () -> new Bird();
    Supplier<Bird> birdSupplier2 = Bird::new;
    birdSupplier.get();
    birdSupplier2.get();

    // ! Example 3
    Comparator<Integer> sortByDesc = (i1, i2) -> i2.compareTo(i1);
    // ! For method reference, it implictly return i1.compareTo(i2) -> can handle ascending ordering logic ONLY
    Comparator<Integer> sortByAsc = Integer::compareTo;

    List<Integer> integers = Arrays.asList(9,-2,100,-50);
    Collections.sort(integers, sortByDesc);
    System.out.println(integers);
    Collections.sort(integers, sortByAsc);
    System.out.println(integers);

    // ! Example 4 (Static method)
    Function<String, Integer> conversionHelper = s -> Integer.valueOf(s);
    System.out.println(conversionHelper.apply("123")); // 123
    Function<String, Integer> conversionHelper2 = Integer::valueOf;
    System.out.println(conversionHelper2.apply("123")); // 123

  }
}
