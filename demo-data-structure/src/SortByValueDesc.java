import java.util.Comparator;
import generic.Ball;

// Write a class representing a sorting formula for a specific object
public class SortByValueDesc implements Comparator<Ball> {
  @Override
  // ! o1 -> -1; o2 -> 1
  public int compare(Ball o1, Ball o2){ // just compare value, disregard colors
    return o1.getValue() > o2.getValue() ? -1 : 1;
  }
}
