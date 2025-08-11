import java.util.Arrays;

public class DemoArray1 {
  public static void main(String[] args) {
    // Problem: Store / Read a series of ame type of data
    int x = 3;
    int y = 7;
    int a = 10;
    // e.g. ages [8, 1, 10, 50]
    // Data structure - read / write data in a location -> array

    // 1. Create an array
    int[] arr = new int[4]; // create 4 spaces for int numbers
    // 2. Place numbers into the array
    // [0] -> index, starting from 0, length 0 1 is the last index
    arr[0] = 8;
    arr[1] = 1;
    arr[2] = 10;
    arr[3] = 50;
    System.out.println(arr.length); // 4 **Special Case: arr.length <--No Bracket()
    // 3. Modify element in array
    // replace 100 into the second postion of the array
    arr[1] = 100;
    // 4. Print all elements in the array
    System.out.println(arr); // [I@54bedef2 (Object Reference)
    System.out.println(Arrays.toString(arr)); // [8, 100, 10, 50]

    // double array, length 6
    double[] arr2 = new double[6];
    arr2[0] = 3.3;
    arr2[1] = 3.4;
    arr2[2] = 100.9;
    arr2[3] = 99.9;
    arr2[4] = 1000.9;
    arr2[5] = -999.999;
    System.out.println(Arrays.toString(arr2)); // [3.3, 3.4, 100.9, 99.9, 1000.9, -999.999]

    // String array, names, length 5
    String[] arr3 = new String[5];
    arr3[0] = "apple";
    arr3[1] = "boy";
    arr3[2] = "cat";
    arr3[3] = "dog";
    arr3[4] = "egg";
    System.out.println(Arrays.toString(arr3)); // [apple, boy, cat, dog, egg]
    // arr3[-1] = "Peter"; <-- Wrong code: index out of bounds
    // Print the last element
    System.out.println(arr3[arr3.length - 1]); // egg
  }
}
