import java.util.List;
import java.util.Vector;

public class VectorTask implements Runnable{
  private List<Integer> integers;

  public VectorTask() {
    this.integers = new Vector<>();
  }
  @Override
  public void run() {
    for (int i = 0; i < 10_000; i++) {
      this.integers.add(1);
    }
  }
  public List<Integer> getInteger() {
    return this.integers;
  }
}
