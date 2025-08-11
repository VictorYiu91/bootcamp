public class DemoMath {
  public static void main(String[] args) {
    double pi = Math.PI;
    double radius = 3.5;
    double circleArea = radius * radius * Math.PI;
    System.out.println(circleArea);

    double base = 3.5;
    double height = 4.5;
    double triangleArea = (base * height) / 2;
    System.out.println(triangleArea);

    // absolute value
    System.out.println(Math.abs(-9)); // 9 , return int
    System.out.println(Math.abs(-9.5)); // 9.5 return double
    System.out.println(Math.abs(9)); // 9 , return int
    System.out.println(Math.abs(9.5)); // 9.5 return double

    // power of
    // 2^10
    System.out.println(Math.pow(2.0, 10.0)); // 1024.0 return double
    // 2^-2
    System.out.println(Math.pow(2.0,-2.0)); // 0.25

    // Ceiling /Floor
    System.out.println(Math.ceil(3.5)); // 4.0
    System.out.println(Math.ceil(3.1)); // 4.0
    System.out.println(Math.floor(3.5)); // 3.0
    System.out.println(Math.floor(3.9)); // 3.0

    // Rounding off
    System.out.println(Math.round(3.4)); // 3
    System.out.println(Math.round(3.5)); // 4
    System.out.println(Math.round(3.14)); // 3
    System.out.println(Math.round(3.15)); // 3
    // 3.145 -> 3.150 (round 2d.p.)
    double d1 = 3.145;
    System.out.println(Math.round(d1 * 100.0) / 100.0); // 3.15

    // Square Root
    System.out.println(Math.sqrt(81)); // 9.0
    System.out.println(Math.sqrt(80)); // ~8.94427

    // Random Number
    System.out.println(Math.random()); // 0.0 - 1.0
    // 0-100
    System.out.println((int)(Math.random()*100.0));
    // 10-80 --> (0~70)+10
    System.out.println((int)(Math.random()*70.0) + 10); // 10 - 80

  }
}
