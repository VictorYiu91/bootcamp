package hero;

// ! final class -> cannot be extended
public final class Heros {
  public static final int[] MAX_HP =
      new int[] {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
  public static final int[] MAX_MP =
      new int[] {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
  public static final int[] PA =
      new int[] {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
  public static final int[] PD = new int[] {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
  public static final int[] MA =
      new int[] {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
  public static final int[] MD = new int[] {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
  public static final int[] AG = new int[] {10, 10, 15, 15, 20, 20, 25, 25, 30, 30};
  public static final int[] CC = new int[] {10, 10, 10, 20, 20, 20, 30, 30, 35, 35};
  public static final double[] MAX_EXP = // exp for level up
      new double[] {3.0, 5.0, 7.0, 9.0, 11.0, 13.0, 15.0, 17.0, 19.0, 21.0};
  public static final double[] EXP_GAINED = // exp gained from enemy
      new double[] {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5};

  // Static method getMaxHP
  public static int getMaxHp(int level) {
    if (level < 1 || level > Heros.MAX_HP.length)
      return -1;
    return Heros.MAX_HP[level - 1];
  }

  public static int getMaxMp(int level) {
    if (level < 1 || level > Heros.MAX_MP.length)
      return -1;
    return Heros.MAX_MP[level - 1];
  }

  public static int getPA(int level) {
    if (level < 1 || level > Heros.PA.length)
      return -1;
    return Heros.PA[level - 1];
  }

  public static int getPD(int level) {
    if (level < 1 || level > Heros.PD.length)
      return -1;
    return Heros.PD[level - 1];
  }
  
  public static int getMA(int level) {
    if (level < 1 || level > Heros.MA.length)
      return -1;
    return Heros.MA[level - 1];
  }

  public static int getMD(int level) {
    if (level < 1 || level > Heros.MD.length)
      return -1;
    return Heros.MD[level - 1];
  }
  
  public static int getAG(int level) {
    if (level < 1 || level > Heros.AG.length)
      return -1;
    return Heros.AG[level - 1];
  }
  
  public static int getCC(int level) {
    if (level < 1 || level > Heros.CC.length)
      return -1;
    return Heros.CC[level - 1];
  }
  public static double calcAddedExp(int killedheroLevel) {
    return Heros.EXP_GAINED[killedheroLevel - 1];
  }
}
