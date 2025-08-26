package hero;

public class DemoHero {
  public static void main(String[] args) {
    Hero henry = new Archer("Henry");
    Hero deep = new Warrior("Deep");
    Hero john = new Mage("John");
    System.out.println(henry.status());
    System.out.println(deep.status());
    System.out.println(john.status());
    System.out.println(henry.getPA());
    System.out.println(john.getPD());
    henry.pAttack(john);
    System.out.println(john.status());
    john.levelUp();
    System.out.println(john.status());
    deep.mAttack(john);
    System.out.println(john.status());
    john.recoverHp();
    System.out.println(john.status());
    john.levelUp();
    john.levelUp();
    john.levelUp();
    henry.levelUp();
    henry.levelUp();
    henry.levelUp();
    henry.levelUp();
    henry.levelUp();
    henry.levelUp();
    System.out.println(henry.getPA());
    System.out.println(henry.getMA());
    henry.pAttack(john);
    System.out.println(john.status());
  }
}
