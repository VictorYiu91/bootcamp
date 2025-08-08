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
  
    //leap year
    //divided by 4, -> leap year (i.e. 2024)
    //divided by 100 -> not a leap year (i.e. 2100, 1900)
    //divided by 400 -> leap Year (i.e. 2000)
    //cannot divided by 4 -> not a leap year (i.e. 2025)

    int year = 2400;
    boolean isLeapYear = false;
    //My approach
    if (year % 100 == 0) {
      if (year % 400 ==0) {
        isLeapYear = true;
      }
    } else {
      if (year % 4 == 0) {
        isLeapYear = true;
      }
    }
    System.out.println("Leap Year?" + isLeapYear);
    //tutor's approach
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          isLeapYear = true;
        } 
      } else {
        isLeapYear = true;
      }
    }
    System.out.println("Leap Year?" + isLeapYear);
    
    isLeapYear = year % 4 == 0 && (year % 100 == 0 && year % 400 == 0 || year % 100 != 0 );
    // else-if (use for mutually exclusive case)
    int score = 85;
    char grade = ' ';
    // A: 90 or above
    // B: 80 - 90
    // C: 70 - 79
    // F: < 70
    if (score >= 90) {
      grade ='A';
    } else if (score >= 80 && score < 90) {
      grade = 'B';
    } else if (score >= 70 && score < 80) {
      grade = 'C';
    } else {grade = 'F';}
    System.out.println("Grade=" + grade); // Grade = B

    // 1. if-else, if else if-else, if , if-else if
    // 2. switch
    // 3. "case" can check equals value ONLY, NO range checking
    // 4. No AND checking (-> Single condition)

    // Bad Example for switch
    score = 75;
    switch(score) {
      case 91:
      grade = 'A';
      case 92:
      grade = 'A';
      case 93:
      grade = 'A';
      //...
    }
    // Good Example for switch
    // R G B
    // By default, run all code block afer meet the condition
    // -> you have to "break" it manually to exit the switch
    char color = 'R';
    switch (color) {
      case 'R':
      System.out.println("It is red.");
      break;
      case 'G':
      System.out.println("It is green.");
      break;
      case 'B':
      System.out.println("It is blue.");
      break;
    }
    // conclusion:
    // 1. Finite values (e.g. Weeks, Direction)
    // 2. Different purpose for different cases
  }
}




