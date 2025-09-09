import java.util.Optional;

public class DemoOptional2 {
  // ! Don't
  private Optional<String> name;
  // ! We should
  private String name2;

  // ! Don't
  public DemoOptional2(Optional<String> name) {
    this.name = name;
  }

  // ! We should
  public DemoOptional2(String name) {
    if (name == null)
      throw new IllegalArgumentException("name should not be null.");
    this.name2 = name;
  }

  // ! Don't
  public Optional<String> getName() {
    return this.name;
  }

  // ! We should
  public String getName2() {
    return this.name2;
  }

  public static void main(String[] args) {
    new DemoOptional2(Optional.of("John"));
  }

}