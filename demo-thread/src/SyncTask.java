public class SyncTask implements Runnable {
  private int x;

  @Override
  public synchronized void run() {
    for (int i = 0; i < 100_000; i++) {
      this.increment();
    }
  }

  public synchronized void increment() {
    this.x++;
  }

  public int getX() {
    return this.x;
  }
}
