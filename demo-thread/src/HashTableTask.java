import java.util.Hashtable;

public class HashTableTask implements Runnable {
  private Hashtable<String, Integer> map;

  public HashTableTask() {
    this.map = new Hashtable<>();
  }

  @Override
  public synchronized void run() {
    // ! As we now have 2 method, 
    // ! even they individually synchronized, they are not guarantee synchronized as a whole.
    // ! we need to lock both getOrDefault() and put() in a bundle -> sychronized the run()
    for (int i = 0; i < 10_000; i++) {
      int value = this.map.getOrDefault("apple", 0); // key
      this.map.put("apple", value + 1); // key
    }
  }

  public Hashtable<String, Integer> getMap() {
    return this.map;
  }
}
