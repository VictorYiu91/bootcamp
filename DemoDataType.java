public class DemoDataType {
  public static void main(String[] args) {
    // int, double, boolean, char, byte, short, long, float (Primitive)
    // String

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
    // char range; 0 - 6xxxx
    char gender = 'M';
    System.out.println(gender);
    // char to Ascii code of word
    char zh = '體';
    int zhAscii = zh;
    System.out.println(zhAscii); // 39636
    char jp = 'の';
    int jpAscii = jp;
    System.out.println(jpAscii); // 12398
    char cn = '体';
    int cnAscii = cn;
    System.out.println(cnAscii); // 20307

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
    int r1 = b1 + s3; // *byte value + short value -> int + int -> int
    System.out.println(r1); // 32894
    // Short r1 = b1 + s3; is not allowed as byte + short -> int -> it cannot assign to short variable
    // byte b10 = b1 + 1; is not allowed byte + int -> int -> it cannot assign to byte variable
    int r2 = b1 + 1; // allowed
    int i10 = 2_147_483_647; // postive thresold of int value
    int i11 = i10 + 1; // overflow -> go to negative end of int value -> -2147483648
    System.out.println(i11); // -2147483648
    int i12 = i10 + 10; // overflow
    System.out.println(i12); // -2148493639
    int i13 = 2_100_000_000 + 100_000_000; // overflow
    System.out.println(i13); // -2094967296
    int i14 = -2_147_483_648; // negative thresold of int value
    int i15 = i14 - 1; // overflow -> go to postive end of in value -> 2147483647
    System.out.println(i15); // 2147483647

    // float width = 7.84; not allowed 
    // by default, 7.84 is a double value; 7 is a int value
    float width = 7.84f; 
    System.out.println(width); // 7.84
    // Level: double > float
    // float f1 = 7.77 // not allowed because 7.7 is double value, and we cannot assign double value to float variable.

    float length = 5.3f;
    float area = length * width;
    System.out.println(area); // 41.552002

    // float area2 = length * 7.84; not allowed
    // float * double -> double value -> float variable (NOT OK)

    //ASCII Code
    // a,b,c,d...1,2,3,4,...!@#$%...
    //0=48 ; A=65; a=97;
    char letter = 97; // we can assgin 'a' or ASCII code
    System.out.println(letter); // a

    // char letter2 = letter + 1; not allowed
    // Step 1: char value + int value -> int -> cannot assign int alue to char variable. 
    
    int letter2 = letter + 1; // char + int -> int
    System.out.println(letter2); // 98 (not b)
    // solution to 'b': downcast
    char letter3 =(char) (letter + 1); // downcast (int -> char)
    System.out.println(letter3); // b

    int asciiForZero = 48;
    char letter4 = (char)(asciiForZero);
    System.out.println(letter4); // 0

    int asciiForA = 'A';
    // Step 2: assign char calue into int variable (OK)
    // Step 3: auto-convert char value to ascii code
    System.out.println(asciiForA); // 65

    char letterforZ = 'A' + 25; // ! allow for explict char value + explict int value (NO RISK)
    System.out.println(letterforZ); // Z
    
    char letter5 = (char)(33333); // downcast (int -> char)
    System.out.println(letter5); // 舵

    int distance = 2;
    char letterForC = (char) ('A' + distance); // explict char value + int variable (RISKY)
    System.out.println(letterForC); // C

  }
}
