public class DemoConditional {
  public static void main(String[] args) {
    // if else -> control program flow
    int x = 13;
    if (x > 12) {
      System.out.println("hello");
    } else { // x <= 12
      System.out.println("goodbye");
    }
    // declare y = ; 
    // declare counter
    // check if double value > 999.5, counter +1, otherwise, counter +2
    // print out counter
    double y = 1003.1415;
    int counter = 0;
    if (y > 999.5) {
      counter = counter +1;
    } else {
      counter = counter +2;
    }
    System.out.println(counter);

    // and (&&) or (||)
    int a = 10;
    int b = 90;
    if (a > 5 && b > 80) {
      System.out.println("do something"); // print
    } else {
      System.out.println("do something else");
    }

    // && > ||
    // a > 9 && b > 90 -> true && false -> false
    // b % 2 == 0 -> true ; "=="means "checking if"
    // finally: false || true -> true
    if (a > 9 && b > 90 || b % 2 == 0) {
      System.out.println("correct"); // print
    } else {
      System.out.println("incorrect");
    }

    // HOMEWORK
    int age = 66;
    //char gender = 'F';
    //char smoker = 'Y';
    boolean isFemale = true;
    boolean isSmoker = true;
    double premium = 100.0;
    double percentage = 0.0;
    // Conditions:
    // 1) Female -> 10% extra premium
    // 2) Smoker -> 15% extra premium
    // 3) Age > 50 and Male -> 8% extra premium

    // Program: run fast? readability? development time?
    // Refactoring the program -> extract the duplicate condtion to do finally
    // in the above case -> isSmoker is common factor (needa check even if Male or Female)
    
    if (isFemale){ // same as "if (isFemale == true)"
      percentage += 10.0;
    } else { // Male
      if (age > 50) {
        percentage += 8.0;
      } 
    }
    if (isSmoker) {
      percentage += 15.0;
    }
    System.out.println(percentage);
    premium = premium * ((100.0 + percentage)/100.0);
    System.out.println(premium);
  
  }
  }



