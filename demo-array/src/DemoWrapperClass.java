public class DemoWrapperClass {
  public static void main(String[] args) {
    //Wrapper Class, corresponding to a primitive
    //int (primitive) -> Integer (Wrapper Class)
    //byte -> Byte
    //short -> Short
    //long -> Long
    //char -> Character
    //boolean -> Boolean
    //float -> Float
    //double -> Double

    // ! Wrapper Class (More functionalities)
    // ! Primitive (For storing value, comparisonm basic Math operation)

    // Define Wrapper Class Value (XXX.valueOf())
    System.out.println(Integer.valueOf(3));
    System.out.println(Long.valueOf(3)); // int -> long -> Long
    System.out.println(Character.valueOf('a'));
    System.out.println(Boolean.valueOf(true));
    System.out.println(Double.valueOf(3.3));
    System.out.println(Short.valueOf((short)3));
    System.out.println(Byte.valueOf((byte)3));

    Integer x = 3; // Assign int value into Integer variable (Auto-box)
    int x2 = x; // Assing Integer value int int variable (Un-box)
    String s = x.toString();
    long l1 = x.longValue();
    long l2 = x; // Integer -> int -> long
    Character ch = 'a'; // Auto-box
    char ch2 = ch; // Un-box

    // int -> long (auto promotion)
    long l3 = 7;
    // long -> int (explict)
    int x3 = (int)l1;

    // int -> Long
    // Integer has no relationship with Long
    // Long l4 = 10; cannot convert, int -> Interger -> Long (Not OK)
    Long l4 = (long) 10; // int -> long (upcast) -> Long (auto-box)
    // long -> Integer
    // Integer x4 = 4L; cannot convert, long -> Long -> Integer (NOT OK)
    Integer x4 = (int) 4L; // long -> int (downcast) -> Integer (auto-box)

    // ! Comparison
    // ! Primitie comparison (>, <, >=, <=, ==, !=)
    // ! Wrapper Clasee comparsion (use method ONLY, compareTo)
    Integer i1 = 10;
    Integer i2 = 11;
    System.out.println(i1 > i2); // false, int > int (Not professional)
    System.out.println(i1.compareTo(i2)); //-1

    int i3 = 12;
    System.out.println(i1.compareTo(i3)); // -1
    // ! i3 is a Primitive, which has NO functionality
    // System.out.println(i3.compareTo(i1)); wrong

    // Integer vs Long
    Integer x5 = 10;
    Long l5 = 20L;
    System.out.println(x5.longValue()>l5.longValue());
    // upcast is safe more than downcast; int -> long better than long -> int

    // Character (ASCII)
    Character ch3 ='b';
    System.out.println(ch3.charValue() > 97); // OK
    System.out.println(ch3.compareTo(Character.valueOf('b')));


  }
}
