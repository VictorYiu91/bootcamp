package enum1;

public class DemoEnum {
  public static void main(String[] args) {
    Book b1 = new Book(1, Color.RED);
    Book b2 = new Book(2, Color.BLUE);
    System.out.println(b1.getColor());
    System.out.println(b2.getColor());
    b2.setColor(Color.YELLOW);
    System.out.println(b2.getColor());

    // equals, hashCode, toString
    // ! Primitive and Enum use comparison operators
    // enum -> == or !=
    if (b1.getColor() == Color.RED) { // Checking Address ( We have ONLY one Color.RED in memory)
      System.out.println("It is Red");
    } else {
      System.out.println("Not Red");
    }
    OrderStatus o1 = OrderStatus.PREPARING;
    System.out.println(o1.next().next());

    Direction d1 = Direction.EAST;
    Direction d2 = Direction.NORTH;
    System.out.println(d1.opposite());
    System.out.println(d2.opposite());
  }
}
