import java.util.ArrayList;
import java.util.List;
import generic.Ball;
import generic.Color;
import generic.Passenger;

public class DemoGeneric {
  public static void main(String[] args) {
    // Collections (Java 1/2)
    // Generic (after Java 5) -> List<String>

    // before Java 5
    List objects = new ArrayList<>();
    objects.add(new Ball(Color.RED, 3));
    objects.add(new Passenger(35));

    for (Object o : objects) {
      if (o instanceof Ball) {
        Ball ball = (Ball) o;
        System.out.println(ball.getColor());
      } else if (o instanceof Passenger) {
        Passenger passenger = (Passenger) o;
        System.out.println(passenger.getAge());
      }
    }
    // After Java 5
    // During the compile time, you have to specify the type of object
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(Color.RED,3));
    for (Ball b: balls) {
      System.out.println(b.getColor());
    }
  }
}
