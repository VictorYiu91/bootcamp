public class Example2 {

  public static void main(String[] args) {
    Task task = new Task();
    Thread worker1 = new Thread(task);
    Thread worker2 = new Thread(task);

    worker1.start(); // execute task.run();
    worker2.start();

    try {
      // ! main thread will waith until worker1 come back
      worker1.join();
      // ! main thread will waith until worker2 come back
      worker2.join();
    } catch (InterruptedException e) {
    }

    System.out.println(task.getX());
  }
}
