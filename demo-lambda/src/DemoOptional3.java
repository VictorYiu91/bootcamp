import java.util.Optional;

public class DemoOptional3 {
  // ! Don't -> method input parameter type
  public static char searchChar(Optional<String> source, int index) {
    if (source == null || source.get() == null)
      throw new IllegalArgumentException("the data should not be null.");
    return source.get().charAt(index);
  }

  // ! Correct Design
  public static char searchChar2(String source, int index) {
    if (source == null)
      throw new IllegalArgumentException("the data should not be null.");
    return source.charAt(index);
  }
}