public class DemoOperator {
  public static void main(String[] args) {
    // Math Operator: +=, -=, *=, /=, ++, --
    int x =3;
    x += 4; // ! same as x = x + 4
    System.out.println(x); // 7

    int y = 9;
    y -= 8; // ! same as y = y - 8
    System.out.println(y); // 1

    int z = 8;
    z *= 4; // ! same as z = z * 4
    System.out.println(z); // 32

    int p = 10;
    p /= 3; // ! same as p = p / 3
    System.out.println(p); // 3

    // +1
    int u = 1;
    u++;
    System.out.println(u); // 2
    u = u + 1;
    u += 1;
    System.out.println(u); // 4

    // -1
    int h = 5;
    h--;
    System.out.println(h); // 4
    h = h - 1;
    h -= 1;
    System.out.println(h); // 2

    // Comparison operator: >, <, >=, <=, !=, ==
    // Approach 1
    int age = 70;
    boolean isElderly = age > 65;
    // Approach 2
    if (age > 65) {
      isElderly = true;
    }
    char ch = 'A';
    boolean isCharEqualsToA = ch == 65;
    System.out.println(isCharEqualsToA); // true

    char grade = 'R'; // valid Grades: A, B, C, D, E, F
    //Approach 1: Use OR ||
    boolean isGradeValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'E' || grade == 'F';
    //Approach 2: if else
    isGradeValid = false;
    if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'E' || grade == 'F') { //as using comparison operator (>=, <=, >, <), java convert char value to int valure before comparison.
      isGradeValid = true;
    }

    // Odd / Even number
    int number = 23;
    boolean isOdd = number % 2 ==1;
    System.out.println(isOdd); // true
    if (isOdd) { // better readability
      System.out.println("hello");
    }
    if (number % 2 ==1) {
      System.out.println("hello");
    }

    // Find Maximum
    int a = 7;
    int b = 4;
    int c = 9;
    int d = 10;
    int max = a;
    if (b > max) {
      max = b;
    }
    if (c > max) {
      max = c;
    }
    if (d > max) {
      max = d;
    }
    System.out.println("max value=" + max); // max value=10
} 
}
