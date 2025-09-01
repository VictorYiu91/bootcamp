import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    // Queue
    Queue<String> names = new PriorityQueue<>();
    names.add("John");
    names.add("Steven");
    names.add("Lucas");
    System.out.println(names); // [John, Steven, Lucas]
    names.add("Vincent");
    names.add("Cathy");
    // Ordering has not happened yet during .add()
    System.out.println(names); // [Cathy, John, Lucas, Vincent, Steven]

    // Instead, Priority Queue poll elements in given ordering
    // By default natural ordering (.compareTo())
    System.out.println(names.poll()); // Cathy
    System.out.println(names.poll()); // John

    names.add("Alex");
    System.out.println(names.poll()); // Alex
    System.out.println(names.poll()); // Lucas

    // PQ -> Integer
    Queue<Integer> nums = new PriorityQueue<>();
    nums.add(100);
    nums.add(-80);
    nums.add(800);
    nums.add(790);
    nums.add(20);
    while (!nums.isEmpty()){
      System.out.println(nums.poll());
    }
    // -80, 20, 100, 790, 800
    // Interger natural ordering -> from smallest to largest 
  }
}
