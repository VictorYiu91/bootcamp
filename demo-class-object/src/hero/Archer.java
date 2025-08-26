package hero;

import java.math.BigDecimal;
import java.util.Random;

public class Archer extends Hero {
  private Bow bow;


  public Archer(String playerName) {
    super(playerName);
  }

  @Override
  public int getMaxHp() {
    return Heros.getMaxHp(super.getLevel())
        + Archers.getMaxHpMod(super.getLevel());
  }

  @Override
  public int getMaxMp() {
    return Heros.getMaxMp(super.getLevel())
        + Archers.getMaxMpMod(super.getLevel());
  }

  @Override
  public int getPA() {
    int pCriticalRoll = new Random().nextInt(99)+1;
    int finalPA = Heros.getPA(super.getLevel()) + Archers.getPAMod(super.getLevel());
    if (pCriticalRoll <= this.getCC()) {
      return BigDecimal.valueOf(finalPA).multiply(BigDecimal.valueOf(this.getCD())).intValue();
    }
    return finalPA;
  }

  @Override
  public int getPD() {
    return Heros.getPD(super.getLevel()) + Archers.getPDMod(super.getLevel());
  }

  @Override
  public int getMA() {
    int mCriticalRoll = new Random().nextInt(99)+1;
    int finalMA = Heros.getMA(super.getLevel()) + Archers.getMAMod(super.getLevel());
    if (mCriticalRoll <= this.getCC()) {
      return BigDecimal.valueOf(finalMA).multiply(BigDecimal.valueOf(this.getCD())).intValue();
    }
    return finalMA;
  }

  @Override
  public int getMD() {
    return Heros.getMD(super.getLevel()) + Archers.getMDMod(super.getLevel());
  }

  @Override
  public int getAG() {
    return Heros.getAG(super.getLevel()) + Archers.getAGMod(super.getLevel());
  }

  @Override
  public int getCC() {
    return Heros.getCC(super.getLevel()) + Archers.getCCMod(super.getLevel());
  }

  public double getCD() {
    return Archers.getCD(super.getLevel());
  }

  public void equip(Bow bow) {
    if (super.weaponOn == true) {
      System.out.println("Weapon is already equipped.");
    }
    super.weaponOn = true;
  }

  public void drop() {
    if (super.weaponOn == false) {
      System.out.println("No weapon is equipped.");
    }
    super.weaponOn = false;
  }

  @Override
  public String status() {
    return "Archer(" //
        + super.status() //
        + ")";
  }

}
