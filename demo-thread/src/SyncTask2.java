public class SyncTask2 implements Runnable{
    private int x;

  @Override
  public synchronized void run() {
      this.x++;
  }

  public int getX() {
    return this.x;
  }
}
