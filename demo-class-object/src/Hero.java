import java.math.BigDecimal;

public class Hero {
  // Health point (hp)
  // Maximum Health point (maxHp)
  // Attack point (atk)
  // Starting level -> Level 1
  // Level 1 : Attack Point: 10, MAX HP: 20
  // Level up: + 5 Attack pt & 20 MAX HP / per level
  // HP = 0 -> Die

  private static final int[] MAX_HP =
      new int[] {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
  private static final int[] MAX_MP =
      new int[] {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
  private static final int[] PHY_ATTACK =
      new int[] {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
  private static final int[] PHY_DEFENSE =
      new int[] {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
  private static final double[] MAX_EXP = // exp for level up
      new double[] {3.0, 5.0, 7.0, 9.0, 11.0, 13.0, 15.0, 17.0, 19.0, 21.0};
  private static final double[] EXP_GAINED = // exp gained from enemy
      new double[] {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5};
  private static int idCounter = 0;
  private int id;
  private int hp;
  private int mp;
  private int level;
  private double exp;
  private String name;

  public Hero(String name) {
    this.id = ++idCounter;
    this.level = 1;
    this.hp = MAX_HP[0];
    this.mp = MAX_MP[0];
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
    return getMaxHp(this.level); // <--goes to static method below
  }

  public int getMaxMp() {
    return getMaxMp(this.level); // goes to static method below
  }

  public int getPAtk() {
    return getPAtk(this.level); // goes to static method below
  }

  public int getPD() {
    return PHY_DEFENSE[this.level - 1];
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
    this.hp = MAX_HP[this.level - 1];
  }

  public void recoverMp() {
    this.hp = MAX_MP[this.level - 1];
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
      double addedExp = calcAddedExp(hero.getLevel());
      this.exp = BigDecimal.valueOf(this.exp).add(BigDecimal.valueOf(addedExp))
          .doubleValue();
      if (this.exp >= MAX_EXP[this.level - 1]) {
        this.levelUp();
      }
    }
  }

  public boolean equals(Hero hero) {
    return this.id == hero.getId();
  }

  // Static method getMaxHP
  public static int getMaxHp(int level) {
    if (level < 1 || level > MAX_HP.length)
      return -1;
    return MAX_HP[level - 1];
  }

  public static int getMaxMp(int level) {
    if (level < 1 || level > MAX_MP.length)
      return -1;
    return MAX_MP[level - 1];
  }

  public static int getPAtk(int level) {
    if (level < 1 || level > MAX_HP.length)
      return -1;
    return PHY_ATTACK[level - 1];
  }

  public static double calcAddedExp(int killedheroLevel) {
    return EXP_GAINED[killedheroLevel - 1];
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
    System.out.println(Hero.getPAtk(8)); // 45
  }
}
