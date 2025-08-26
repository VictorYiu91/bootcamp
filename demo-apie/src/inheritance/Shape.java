
package inheritance;
public abstract class Shape {
  private String color;

  // constructor,set,get
  public Shape(String color) {
    this.color = color;
  }

  abstract double area(); // ! abstract method: child class has to implement it.

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
