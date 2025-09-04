import java.util.ArrayList;
import java.util.List;

public class ArrayListTask implements Runnable{
  private List<Integer> nums;

  public ArrayListTask() {
    this.nums = new ArrayList<>();
  }

  @Override
  public synchronized void run() {
    for (int i = 0; i < 10_000; i++) {
      this.nums.add(1);
    }
  }

  public List<Integer> getNums() {
    return this.nums;
  }
}
