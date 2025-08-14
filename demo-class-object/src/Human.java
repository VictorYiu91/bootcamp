import java.math.BigDecimal;
import java.math.RoundingMode;

public class Human {
  // height (m) , weight (kg)
  // BMI = weight / height^2
  private double height;
  private double weight;

  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  public double getbMI() {
    BigDecimal bd = BigDecimal.valueOf(this.height) //
        .multiply(BigDecimal.valueOf(this.height));
    return BigDecimal.valueOf(this.weight) //
        .divide(bd, 2, RoundingMode.HALF_UP) //
        .doubleValue();
  }

  public double getbMI(int scale, RoundingMode roundingMode) {
    BigDecimal bd = BigDecimal.valueOf(this.height) //
        .multiply(BigDecimal.valueOf(this.height));
    return BigDecimal.valueOf(this.weight) //
        .divide(bd, scale, roundingMode) //
        .doubleValue();
  }

  // Method: isOverweight, return boolean, bmi > 30
  public boolean isOverweight() {
    return this.getbMI() > 30;
  }

  public static void main(String[] args) {
    // Human Object
    // 73.5kg / 1.76m
    // get BMI
    Human alex = new Human();
    alex.setHeight(1.76);
    alex.setWeight(73.5);
    System.out.println(alex.getHeight());
    System.out.println(alex.getWeight());
    System.out.println(alex.getbMI());
    System.out.println(alex.getbMI(3, RoundingMode.HALF_UP));
  }
}
