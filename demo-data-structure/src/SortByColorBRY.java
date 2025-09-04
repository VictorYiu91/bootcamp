import java.util.Comparator;
import generic.Ball;
import generic.Color;

public class SortByColorBRY implements Comparator<Ball> {
  @Override
  public int compare(Ball o1, Ball o2) {
    if (o1.getColor() == Color.BLUE)
      return -1;
    if (o2.getColor() == Color.BLUE)
      return 1;
    if (o1.getColor() == Color.RED)
      return -1;
    if (o2.getColor() == Color.RED)
      return 1;
    return -1;
  }
}
