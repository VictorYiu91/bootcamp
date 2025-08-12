import java.util.Arrays;
import java.util.Scanner;

/**
 * Input a Index Position: 3
 * Input a new Value: 120
 * Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
 * New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
 */
// Insert an elements into a specific position of the array
// The original last element should be removed accordingly
// if the specified position is the last index, return the original array
public class JavaQuest10 {

  public static void main(String[] args) {

    int[] oldArr = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(oldArr));

    // code here ...
    int newArr[] = new int[oldArr.length];
    for (int i = 0 ; i < newArr.length; i++) {
      newArr[i] = oldArr[i];
    }
      if (indexPosition != newArr.length-1) {
        newArr[indexPosition] = newValue;
        for (int i = 0; i < newArr.length - indexPosition - 1 ; i++) {
          newArr[indexPosition+1+i] = oldArr[indexPosition+i];
        }
      }
      System.out.println("New Array: " + Arrays.toString(newArr));
  }
}