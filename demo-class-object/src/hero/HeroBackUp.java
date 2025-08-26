package hero;

import java.math.BigDecimal;

public abstract class HeroBackUp {
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
  private String playerName;
  private boolean weaponOn;

  public HeroBackUp(String playerName) {
    this.id = ++idCounter;
    this.level = 1;
    this.hp = this.getMaxHp();
    this.mp = this.getMaxMp();
    this.exp = 0;
    this.playerName = playerName;
    this.weaponOn = false;
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

  public int getPA() {
    return Heros.getPA(this.level); // goes to static method below
  }

  public int getPD() {
    return Heros.getPD(this.level);
  }

  public int getMA() {
    return Heros.getMD(this.level);
  }

  public int getMD() {
    return Heros.getMD(this.level);
  }

  public int getAG() {
    return Heros.getAG(this.level);
  }

  public int getCC() {
    return Heros.getCC(this.level);
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
    this.mp = Heros.MAX_MP[this.level - 1];
  }

  public void deductHp(int deductedHp) {
    this.hp = Math.max(this.hp - deductedHp, 0);
  }

  public void pAttack(Hero hero) {
    int deductedHp = Math.max(this.getPA() - hero.getPD(), 0);
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

  public void mAttack(Hero hero) {
    int deductedHp = Math.max(this.getMA() - hero.getMD(), 0);
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
    return "Hero Name = " + this.playerName +" (" //
    +"Lv."+this.level //
    +" ,HP = " + this.hp//
    +" ,MP = " + this.mp//
    +")"; 
  }

  public static void main(String[] args) {}
}
