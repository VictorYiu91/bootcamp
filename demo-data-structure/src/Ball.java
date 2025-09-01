import java.util.PriorityQueue;
import java.util.Queue;

public class Ball implements Comparable<Ball> {
  private Color color;
  private int value;

  public Ball(Color color, int value) {
    this.color = color;
    this.value = value;
  }

  public Color getColor() {
    return this.color;
  }

  public int getValue() {
    return this.value;
  }

  // Question 1: Ordering: Blue -> RED -> Yellow
  // ! this: -1, that : 1
  // @Override
  // public int compareTo(Ball ball) {
  // if (this.color == Color.BLUE)
  // return -1;
  // if (ball.getColor() == Color.BLUE)
  // return 1;
  // if (this.color == Color.RED)
  // return -1;
  // if (ball.getColor() == Color.RED)
  // return 1;
  // return -1;
  // }

  // Question 2: RED -> YELLOW -> BLUE
  // If they are with same color, order by value in descending.

  @Override
  public int compareTo(Ball ball) {
    if (this.color == ball.getColor()) {
      if (this.value > ball.getValue())
        return -1;
      else
        return 1;
    }
    if (this.color == Color.RED)
      return -1;
    if (ball.getColor() == Color.RED)
      return 1;
    if (this.color == Color.YELLOW)
      return -1;
    if (ball.getColor() == Color.YELLOW)
      return 1;
    return -1;
  }

  @Override
  public String toString() {
    return "Ball(" //
        + "Color=" + this.color //
        + ", Value=" + this.value //
        + ")";
  }

  public static void main(String[] args) {

    Queue<Ball> q1 = new PriorityQueue<>();
    q1.add(new Ball(Color.BLUE, 1));
    q1.add(new Ball(Color.RED, 2));
    q1.add(new Ball(Color.YELLOW, 3));
    q1.add(new Ball(Color.BLUE, 4));
    q1.add(new Ball(Color.RED, 5));
    q1.add(new Ball(Color.YELLOW, 6));
    q1.add(new Ball(Color.BLUE, 7));
    q1.add(new Ball(Color.RED, 8));
    q1.add(new Ball(Color.YELLOW, 9));
    System.out.println(q1.poll());
    System.out.println(q1.poll());
    System.out.println(q1.poll());
    System.out.println(q1.poll());
    System.out.println(q1.poll());
    System.out.println(q1.poll());
    System.out.println(q1.poll());
    System.out.println(q1.poll());
    System.out.println(q1.poll());
  }
}
