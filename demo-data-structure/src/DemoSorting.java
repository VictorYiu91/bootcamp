import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoSorting {
  public static void main(String[] args) {
    // Collections.sort
    List<Passenger> passengers = new LinkedList<>();
    passengers.add(new Passenger(45));
    passengers.add(new Passenger(10));
    passengers.add(new Passenger(66));
    passengers.add(new Passenger(2));
    passengers.add(new Passenger(70));

    for (Passenger p : passengers) {
      System.out.println(p);
    }
    // ! .sort() -> merge sort (loop) -> compareTo()
    Collections.sort(passengers);
    System.out.println(passengers);
    // [Passenger(Age=66), Passenger(Age=70), Passenger(Age=45), Passenger(Age=10), Passenger(Age=2)]

    // Arrays.sort(); -> object.compareTo()
    Passenger[] passengerArr =
        new Passenger[] {new Passenger(45), new Passenger(10),
            new Passenger(66), new Passenger(2), new Passenger(70)};
    Arrays.sort(passengerArr);
    System.out.println(Arrays.toString(passengerArr));
    // [Passenger(Age=66), Passenger(Age=70), Passenger(Age=45), Passenger(Age=10), Passenger(Age=2)]

    // Depends on what output you want
    // String[] -> Array.sort() (Output: Array)
    // String[] -> List<String> -> Collections.sort() (Output: List)
    // int[] -> Array.sort() (Output: Array)
    // int[] -> List<Integer> -> Collections.sort() (Output: List)

    // Comparator<Ball>
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(Color.RED, 28));
    balls.add(new Ball(Color.YELLOW, 100));
    balls.add(new Ball(Color.BLUE, -4));
    balls.add(new Ball(Color.YELLOW, 250));
    Collections.sort(balls, new SortByValueDesc());
    // .SortByValueDesc() just compare value, disregard colors
    System.out.println(balls);
    Collections.sort(balls, new SortByColorBRY());
    // .SortByValueDesc() just compare color in the order of BLUE > RED > YELLOW, disregard value
    System.out.println(balls);

    // ! PriorityQueue + Comparator
    Queue<Ball> bq = new PriorityQueue<>(new SortByColorBRY());
    bq.add(new Ball(Color.RED, 28));
    bq.add(new Ball(Color.YELLOW, 100));
    bq.add(new Ball(Color.BLUE, -4));
    bq.add(new Ball(Color.YELLOW, 250));
    System.out.println(bq.poll());
    System.out.println(bq.poll());
    System.out.println(bq.poll());
    System.out.println(bq.poll());
  }
}
