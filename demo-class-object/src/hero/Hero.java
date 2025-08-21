package hero;
import java.math.BigDecimal;

public class Hero {
  // Health point (hp)
  // Maximum Health point (maxHp)
  // Attack point (atk)
  // Starting level -> Level 1
  // Level 1 : Attack Point: 10, MAX HP: 20
  // Level up: + 5 Attack pt & 20 MAX HP / per level
  // HP = 0 -> Die

  public static int idCounter = 0;
  private int id;
  private int hp;
  private int mp;
  private int level;
  private double exp;
  private String name;

  public Hero(String name) {
    this.id = ++idCounter;
    this.level = 1;
    this.hp = Heros.MAX_HP[0];
    this.mp = Heros.MAX_MP[0];
    this.exp = 0;
    this.name = name;
  }

  public int getHp() {
    return this.hp;
  }

  public int getMp() {
    return this.mp;
  }

  public int getLevel() {
    return this.level;
  }

  public double getExp() {
    return this.exp;
  }

  // instance method getMaxHP()
  public int getMaxHp() {
    // if (this.level < 1 || this.level > MAX_HP.length)
    // return -1;
    // return MAX_HP[this.level - 1];
    return Heros.getMaxHp(this.level); // <--goes to static method below
  }

  public int getMaxMp() {
    return Heros.getMaxMp(this.level); // goes to static method below
  }

  public int getPAtk() {
    return Heros.getPAtk(this.level); // goes to static method below
  }

  public int getPD() {
    return Heros.PHY_DEFENSE[this.level - 1];
  }

  public int getId() {
    return this.id;
  }

  public boolean isAlive() {
    return this.hp > 0;
  }

  public void levelUp() {
    this.level++;
    this.recoverHp();
    this.recoverMp();
    this.exp = 0;
  }

  public void recoverHp() {
    this.hp = Heros.MAX_HP[this.level - 1];
  }

  public void recoverMp() {
    this.hp = Heros.MAX_MP[this.level - 1];
  }

  public void deductHp(int deductedHp) {
    this.hp = Math.max(this.hp - deductedHp, 0);
    // if (this.hp >= deductedHp) {
    // this.hp -= deductedHp;
    // } else {
    // this.hp = 0
    // }
  }

  public void attack(Hero hero) {
    int deductedHp = Math.max(this.getPAtk() - hero.getPD(), 0);
    hero.deductHp(deductedHp);
    if (!hero.isAlive()) {
      double addedExp = Heros.calcAddedExp(hero.getLevel());
      this.exp = BigDecimal.valueOf(this.exp).add(BigDecimal.valueOf(addedExp))
          .doubleValue();
      if (this.exp >= Heros.MAX_EXP[this.level - 1]) {
        this.levelUp();
      }
    }
  }

  public boolean equals(Hero hero) {
    return this.id == hero.getId();
  }


  public String status() { // toString
    return this.name + " (" //
        + "Level = " + this.level//
        + " ,HP = " + this.hp //
        + " ,Max.HP = " + this.getMaxHp() //
        + " ,MP = " + this.mp //
        + " ,Max.MP = " + this.getMaxMp() //
        + " ,ATK = " + this.getPAtk() //
        + " ,Is Alive? = " + this.isAlive() //
        + ")";
  }

  public static void main(String[] args) {
    Hero dennis = new Hero("Dennis");
    Hero woody = new Hero("Woody");
    System.out.println(dennis.status()); // 20
    System.out.println(woody.status()); // 20
    woody.attack(dennis);
    System.out.println(dennis.status()); // 20 - 10 = 10
    dennis.levelUp();
    System.out.println(dennis.status()); // 1 + 1 = 2
    dennis.recoverHp();
    System.out.println(dennis.status()); // 30 -> 40
    dennis.attack(woody);
    System.out.println(woody.status()); // 20 - 15 = 5
    dennis.attack(woody); // 5 - 5 = 0
    System.out.println(woody.status()); // hp 5 < atk 15 -> hp = 0
    System.out.println(Heros.getPAtk(8)); // 45
  }
}
