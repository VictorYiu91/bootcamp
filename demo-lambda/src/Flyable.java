public interface Flyable {
  void fly();

  // ! Traditional, we create a class to create an object with fly() method
  public static void main(String[] args) {
    // anonymous class
    Flyable superman = new Flyable() {
      @Override
      public void fly() {
        System.out.println("Superman is flying...");
      }
    };
    superman.fly(); // Superman is flying...

    Flyable superwoman = new Flyable() {
      @Override
      public void fly() {
        System.out.println("Superwoman is flying...");
      }
    };
    superwoman.fly(); // Superwoman is flying...

    superman = new Bird();
    superman.fly(); // Bird is flying...
  }
}
