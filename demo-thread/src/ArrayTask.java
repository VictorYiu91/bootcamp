public class ArrayTask implements Runnable {
  private int[] numbers;

  public ArrayTask() {
    this.numbers = new int[1];
  }

  @Override
  public synchronized void run() {
    for (int i = 0; i < 10_000; i++) {
        this.numbers[0]++;
    }
  }
  public int[] getNums() {
    return this.numbers;
  }
}
