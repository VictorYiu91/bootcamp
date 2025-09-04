package generic;

public class Square extends Shape{
    private int length;
  public Square (int length) {
    this.length = length;
  }
  public int getLength(){
    return this.length;
  }
  @Override
  public double area() {
    return this.length * this.length;
  }
}
