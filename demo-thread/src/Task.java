public class Task implements Runnable{
  private int x;

  @Override
  public void run() {
    for (int i = 0; i < 100_000; i++) {
      this.x++;
    }
  }
  public int getX() {
    return this.x;
  }
}
