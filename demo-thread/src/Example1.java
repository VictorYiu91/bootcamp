public class Example1 {
  public static void main(String[] args) {
    Task task = new Task();
    Thread worker1 = new Thread(task);
    Thread worker2 = new Thread(task);

    worker1.start(); // execute task.run();
    worker2.start();

    // ! main thread come the end of the program, without waiting the 2 new threads.
    // ! the 2 new threads still working on the x , but the main thread has read the x value.
    System.out.println(task.getX());
  }
}