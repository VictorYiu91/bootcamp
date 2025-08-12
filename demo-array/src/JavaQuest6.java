public class JavaQuest6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ... 
   * 
   */
  public static void main(String[] args) {
    int first = 0, second = 1;
    int number = 0;
    int backup = 0; 
    // for loop to print first 15 numbers in Fibonacci Sequence
    for (int i = 0; i < 15; i++) {
      if (i == 0) {
        number = first;
      } else if (i == 1) {
        number = second;
      } else {
        number = first + second;
        backup = number;
        first = second;
        second = backup; 
      } System.out.println(number);
    }

  }
}