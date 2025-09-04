import java.util.HashMap;

public class HashMapTask implements Runnable{
  private HashMap<String,Integer> basket;

    public HashMapTask() {
    this.basket = new HashMap<>();
  }

  @Override
  public synchronized void run() {
    for (int i = 0; i < 10_000; i++) {
      this.basket.put("apple",this.basket.getOrDefault("apple",0)+1);
    }
  }

  public HashMap<String,Integer> getBasket() {
    return this.basket;
  }
}
