public class DemoDataType {
  public static void main(String[] args) {
    // int, double, String, boolean, char

    String s1 = "hello    WORLD  !!!!!";
    // "hello    WORLD  !!!!!" -> String value
    // s1 -> String variable
    System.out.println(s1);

    // boolean -> true/false result
    // variable naming convention -> camel case
    // Never: is_male, ismale, etc
    boolean isMale = true;

    int age = 66;
    boolean isElderly = age > 65;
    //Step 1 : age > 65 -> true value
    //Step 2 : assign true value into boolean variable
    System.out.println(isElderly); // true

    // char -> define char value -> use single quote ''
    // String -> define String value -> use double quote ""
    // char value has to be single character
    char gender = 'M';
    System.out.println(gender);

    // byte, short, int and long
    byte age2 = 100;
    //byte: -128 to 127
    //short: -32768 to 32767
    //int: -2.1billion to 2.1 billion
    //long: -2^63 to 2^63-1

    // ! java: long > int > short > byte (level of type)
    long l1 = 100;
    // Step 1 : assign 100 int value into long type variable (OK)
    System.out.println(l1); //100
    long l2 = 100L;
    // assign 100L long value into long type variable (OK)
    System.out.println(l2); //100
    byte b1 = 127; 
    byte b2 = -128;
    // byte b3 = 128; out of range
    short s3 = 32767;
    short s4 = -32768;
    // exceptional case: int value (higher) can put into short/byte variable (lower) if within its valid range
    int result = b1 + 7;
    // step 1: byte value + int value -> int value
    // step 2: assign int value into int variable
    System.out.println(result); // 134

  }
}
