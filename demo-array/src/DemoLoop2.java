import java.util.Arrays;

public class DemoLoop2 {
  public static void main(String[] args) {
    // John, Peter, Sally
    String[] names = new String[] {"John", "Peter", "Sally"};
    // for loop pring
    for (int i = 0 ; i < names.length ; i++) {
      System.out.println(names[i]);
    }
    
    // For-each loop
    for(String name: names) {
      // Syntax: for (variable name : array name)
      System.out.println(name);
    }

    // char[] a b c i j k
    char[] chs = new char[] {'a', 'b', 'c', 'i', 'j','k'};
    // for-each loop
    for(char ch : chs) {
      System.out.println(ch);
    }

    // New String method: toCharArray()
    char[] chs1 = "hello".toCharArray();
    for (char ch : chs1) {
      System.out.println(ch);
    }

    // hello -> olleh
    String str = "hello";
    String newStr = "";
    for (int i = str.length()-1 ; i >= 0 ; i--) { // 4 3 2 1 0
      // newStr = newStr + str.charAt(i);
      newStr += str.charAt(i);
    } System.out.println(newStr);

    // while loop
    int n = 3;
    int total = 0;
    while (n > 0) {
      total += n;
      n--;
    } System.out.println("total=" + total); //6

    // Step 1: n > 0? Yes (n=3)
    // Step 2: total becomes 3
    // Step 3: n--
    // Step 4: n > 0? Yes (n=2)
    // Step 5: total becomes 3
    // Step 6: n--
    // Step 7: n > 0? Yes (n=1)
    // Step 8: total becomes 3
    // Step 9: n--
    // Step 10: n > 0? No (n=0) -> exit loop

    // given int = 532 ->  5 + 3 + 2 -> 10
    // Don't convert int to String
    // 1st 532 -> 53 (extract 2)
    // 2nd 53 -> 5 (extract 3)
    // 3rd 5 -> 0 (extract 5)
    int number = 532;
    int total2 = 0;
    while (number > 0) {
      total2 += number % 10;
      number /= 10;
    } System.out.println("total=" + total2);

    // Find Max./ Min. / Sum / Average
    int[] arr = new int[] {4, -9, 100, -50, 400, 230};
    int max = arr[0];
    int min = arr[0];
    int sum = 0;
    for (int x : arr) {
      if (x > max) {
        max = x;
      }
      if (x < min) {
        min = x;
      }
      sum += x;
      
    }
    // int average = sum/arr.length; // int / int -> int
    double average = (double) sum / arr.length;
    System.out.println(max);
    System.out.println(min);
    System.out.println(sum);
    System.out.println(average);

    // swap
    int a = 10;
    int b = 20;
    // exchange their value
    int backup = a;
    a = b;
    b = backup;
    System.out.println(a); // 20
    System.out.println(b); // 10

    // moving elements
    int[] arr2 = new int[] {4, -9, 100, -50, 400, 230};
    // 1. move the head element to the tail -> [-9, 100, -50, 400, 230, 4]
    for (int i = 0 ; i < arr2.length -1 ; i++) {
      backup = arr2[i];
      arr2 [i] = arr2 [i+1];
      arr2[i+1] = backup;
    }
    System.out.println(Arrays.toString(arr2)); // [-9, 100, -50, 400, 230, 4]
    // 2. move the max value to the tail
    for (int i = 0 ; i < arr2.length -1 ; i++) {
      if (arr2[i] > arr2[i+1]) {
        backup = arr2[i];
      arr2 [i] = arr2 [i+1];
      arr2[i+1] = backup;
      }
    }
    System.out.println(Arrays.toString(arr2));
    // 3. Sorting Ascending Order
    // Repating Moving Max value to the tail.
    // [x, x, x, x, x, 400] i=0
    // [x, x, x, x, 230, 400] i=1
    // [x, x, x, 100, 230, 400] i=2
    // [x, x, 4, 100, 230, 400] i=3
    // [-50, -9, 100, 230, 400] i=4

    for (int i = 0; i < arr2.length -1 ; i++) { // i: Number of time to repeat moving max.
      for (int j =0; j < arr2.length -1 -i; j++) { // j: index to move the value
        if (arr2[j] > arr2[j+1]) {
          backup = arr2[j];
          arr2[j] = arr2 [j+1];
          arr2[j+1] = backup;
        } 
      }
    } System.out.println(Arrays.toString(arr2));

    // 4. Put add odd number into another array
    int[] arr3 = new int[] {50, 9 , 4, 100,230, 400};
    int oddLength = 0;
    for (int x : arr3) {
      if (x % 2 == 1) {
        oddLength++;
      }
    }
    int[] oddArr = new int[oddLength];
    int idx = 0;
    for (int x : arr3) {
      if (x % 2 == 1) {
        oddArr[idx] = x;
        idx++;
      }
    } System.out.println(Arrays.toString(oddArr)); // 9
    // 5. Find the character appeared most of thimes in a given string "hello"
    // approach 1: Double Loop
    int targetIdx = -1;
    int maxCount = 0;
    String s = "hello";
    for (int i = 0 ; i < s.length(); i++) {
      int countCh = 0;
      for (int j = 0; j < s.length(); j++) {
        if (s.charAt(i) == s.charAt(j)) {
          countCh++;
        }
      } if (countCh > maxCount) {
        maxCount = countCh;
        targetIdx = i;
      }
    } System.out.println(s.charAt(targetIdx));
    // Approach 2: Given that there is only 26 smalle case characte 'a-z'
    int countCh[] = new int[26];
    for (int i =0; i < s.length(); i++) {
      countCh[s.charAt(i)-'a']++;
    }
    int maxCountCh = countCh[0];
    int chIdx = -1;
    for (int i = 0 ; i < countCh.length; i++) {
      if (countCh[i] > maxCountCh) {
        maxCountCh = countCh[i];
        chIdx = i;
      }
    }
    char chResult = (char)(chIdx + 'a');
    System.out.println(chResult);

    //6. Givern 2 strings, assume they ae with same length
    String str1 = "abcd";
    String str2 = "pqrs";
    //apbqcrds
    // String + char -> String
    // String + int -> String
    // char + char -> int
    String str3 = "";
    for (int i = 0 ; i < str1.length(); i++) {
      str3 = str3 + str1.charAt(i) + str2.charAt(i);
      // str3 += str1.charAt(i) + str2.charAt(i);
      // str3 = str3 + (str1.charAt(i) + str2.charAt(i));
    } System.out.println(str3);
  }
}