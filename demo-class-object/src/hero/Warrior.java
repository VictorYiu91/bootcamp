package hero;

import java.math.BigDecimal;
import java.util.Random;

public class Warrior extends Hero {
  private Sword sword;

  public Warrior(String playerName) {
    super(playerName);
  }


  @Override
  public int getMaxHp() {
    return Heros.getMaxHp(super.getLevel())
        + Warriors.getMaxHpMod(super.getLevel());
  }

  @Override
  public int getMaxMp() {
    return Heros.getMaxMp(super.getLevel())
        + Warriors.getMaxMpMod(super.getLevel());
  }

  @Override
    public int getPA() {
    int pCriticalRoll = new Random().nextInt(99)+1;
    int finalPA = Heros.getPA(super.getLevel()) + Warriors.getPAMod(super.getLevel());
    if (pCriticalRoll <= this.getCC()) {
      return BigDecimal.valueOf(finalPA).multiply(BigDecimal.valueOf(this.getCD())).intValue();
    }
    return finalPA;
  }

  @Override
  public int getPD() {
    return Heros.getPD(super.getLevel()) + Warriors.getPDMod(super.getLevel());
  }

  @Override
  public int getMA() {
    int mCriticalRoll = new Random().nextInt(99)+1;
    int finalMA = Heros.getMA(super.getLevel()) + Warriors.getMAMod(super.getLevel());
    if (mCriticalRoll <= this.getCC()) {
      return BigDecimal.valueOf(finalMA).multiply(BigDecimal.valueOf(this.getCD())).intValue();
    }
    return finalMA;
  }

  @Override
  public int getMD() {
    return Heros.getMD(super.getLevel()) + Warriors.getMDMod(super.getLevel());
  }

  @Override
  public int getAG() {
    return Heros.getAG(super.getLevel()) + Warriors.getAGMod(super.getLevel());
  }

  @Override
  public int getCC() {
    return Heros.getCC(super.getLevel()) + Warriors.getCCMod(super.getLevel());
  }

  public double getCD() {
    return Warriors.getCD(super.getLevel());
  }

  @Override
  public String status() {
    return "Warrior(" //
        + super.status() //
        + ")";
  }

}
