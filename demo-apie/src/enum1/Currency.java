package enum1;

public enum Currency {
  HKD("Hong Kong Dollar", 1), //
  USD("US Dollar", 2), //
  CNY("RMB", 3), //
  AUD("Australia Dollar", 4),;

  private String description;
  private int value;

  private Currency(String description, int value) {
    this.description = description;
    this.value = value;
  }

  public String getDescription() {
    return this.description;
  }

  public int getValue() {
    return this.value;
  }
}
