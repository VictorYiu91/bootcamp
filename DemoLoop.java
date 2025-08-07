public class DemoLoop {
public static void main(String[] args) {
  //if-else (program flow)
  int x = 2;
  x = x * 2; // programming should be able to run this line multiple times
  x = x * 2;
  x = x * 2;
  x = x * 2;
  x = x * 2;
  x = x * 2;
  x = x * 2;
  x = x * 2;
  x = x * 2;
  System.out.println(x);

  // Loop (Programming Tool)
  // ! initializer ; condition to continue; modifier)
  for (int i = 0; i < 10 ; i++ ) {
    System.out.println("hello");
  }

  for (int i = 0; i <3; i++) {
    System.out.println("abc");
  }
  // Step 1: int i = 0;
  // Step 2: i < 3 ? yes (i = 0)
  // Step 3: print abc
  // Step 4: i++
  // Step 5: i < 3 ? yes (i = 1)
  // Step 6: print abc
  // Step 7: i++
  // Step 8: i < 3 ? yes (i = 2)
  // Step 9: print abc
  // Step 10: i++
  // Step 11: i < 3 ? no (i = 3)
  // ! Conclusion: the above loop excuted 11 lines of code.

  //for (int i = 0; i < n ;i++) {} only n is the variable

  //1. use for loop to print 1 3 5 7 9 vertically.
  for (int i = 0; i < 10; i++) {
    if (i % 2 == 1){
      System.out.println(i);
    }
  }

  //2. 2^10 by loop
  int base = 2;
  int result = base;
  for (int i = 0; i < 9; i++) {
    result *= base;
  }
  System.out.println(result);

  //3. 1-100, print the number which divided by 3 and divided by 10
  for (int i = 0; i < 101; i++) {
    if (i !=0 && i % 3 == 0 && i % 10 == 0) {
      System.out.println(i);
    }
  }
  //4. Given a String, 
  //4a check if this String contains 'l' character (by for loop)
  //4b count the numer of 'l'
  String s1 = "hello";
  char targetCh = 'l';
  int counter = 0; 
  for (int i = 0; i < s1.length(); i++) {
    if (s1.charAt(i) == targetCh) {
      counter++;
    }
  }
    if (counter > 0) {
      System.out.println(targetCh + " is found, count=" +counter);
    } else {
      System.out.println(targetCh + " is not found");
    }
    //searching pattern
    String s2 = "hello";
    String targetStr = "ell";
    boolean isMatched = true;
    boolean isEverMatched = false;

    for (int i = 0 ; i < s2.length() - targetStr.length(); i++) {
      isMatched = true;
      for (int j =0 ; j < targetStr.length(); j++) {
        if (s2.charAt(i + j) != targetStr.charAt(j)) {
          isMatched = false;
        }
      }
      if (isMatched) {
        isEverMatched = true;
      }
    }
    if (isEverMatched) {
      System.out.println("Pattern " + targetStr + " is found.");
    } else {
      System.out.println("Pattern " + targetStr + " is not found.");
    }
    System.out.println(s2.contains(targetStr)); // true;
} 
}
