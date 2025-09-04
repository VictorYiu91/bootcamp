public class Example7 {
    public static void main(String[] args) {
    HashMapTask task = new HashMapTask();
    Thread worker1 = new Thread(task);
    Thread worker2 = new Thread(task);

    // ! Most Likely Error -> ArrayList -> Array -> Copy of array fixed length
    worker1.start();
    worker2.start();

    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) {
    }
    System.out.println(task.getBasket().get("apple"));
  }
}
