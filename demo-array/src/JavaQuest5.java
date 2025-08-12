public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c';
    

    // if found, print "Found."
    // if not found, print "Not Found."
    // code here ...
    boolean isFound = false;
    for (int i = 0 ; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        isFound = true;
        break;
      }
    }
    if (isFound) {
      System.out.println("Found, the index of the last character of " + target + " is " + str.lastIndexOf(target));
    } else {
      System.out.println("Not found");
    }

  }
}