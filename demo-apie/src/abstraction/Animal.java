package abstraction;

public class Animal implements Surivable{
  public Animal() {

  }
  
  @Override
  public void sleep() {
    System.out.println("Animal is sleeping...");
  }
  @Override
  public void eat(){
    System.out.println("Animal is eating...");
  }
  @Override
  public void drink(){
    System.out.println("Animal is drinking...");
  }
  public static void main(String[] args) {
    Surivable[] animals = new Surivable[3];
    for (Surivable animal: animals) {
      animal.drink();
      animal.eat();
      animal.sleep();
    }
  }
}
