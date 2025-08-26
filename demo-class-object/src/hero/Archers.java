package hero;

public final class Archers {
  public static final int[] MAX_HP_MODIFIER =
      new int[] {10, 10, 10, 25, 25, 30, 30, 35, 35, 40};
  public static final int[] MAX_MP_MODIFIER =
      new int[] {20, 20, 20, 35, 35, 40, 40, 45, 45, 50};
  public static final int[] PA_MODIFIER =
      new int[] {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
  public static final int[] PD_MODIFIER =
      new int[] {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
  public static final int[] MA_MODIFIER =
      new int[] {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
  public static final int[] MD_MODIFIER =
      new int[] {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
  public static final int[] AG_MODIFIER =
      new int[] {10, 10, 15, 15, 20, 20, 25, 25, 30, 30};
  public static final int[] CC_MODIFIER =
      new int[] {2, 2, 2, 4, 4, 7, 7, 10, 10, 15};
  public static final double[] CD =
      new double[] {1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 2.0, 2.0};

  public static int getMaxHpMod(int level) {
    if (level < 1 || level > Archers.MAX_HP_MODIFIER.length)
      return -1;
    return Archers.MAX_HP_MODIFIER[level - 1];
  }

  public static int getMaxMpMod(int level) {
    if (level < 1 || level > Archers.MAX_MP_MODIFIER.length)
      return -1;
    return Archers.MAX_MP_MODIFIER[level - 1];
  }

  public static int getPAMod(int level) {
    if (level < 1 || level > Archers.PA_MODIFIER.length)
      return -1;
    return Archers.PA_MODIFIER[level - 1];
  }

  public static int getPDMod(int level) {
    if (level < 1 || level > Archers.PD_MODIFIER.length)
      return -1;
    return Archers.PD_MODIFIER[level - 1];
  }

  public static int getMAMod(int level) {
    if (level < 1 || level > Archers.MA_MODIFIER.length)
      return -1;
    return Archers.MA_MODIFIER[level - 1];
  }

  public static int getMDMod(int level) {
    if (level < 1 || level > Archers.MD_MODIFIER.length)
      return -1;
    return Archers.MD_MODIFIER[level - 1];
  }

  public static int getAGMod(int level) {
    if (level < 1 || level > Archers.AG_MODIFIER.length)
      return -1;
    return Archers.AG_MODIFIER[level - 1];
  }

  public static int getCCMod(int level) {
    if (level < 1 || level > Archers.CC_MODIFIER.length)
      return -1;
    return Archers.CC_MODIFIER[level - 1];
  }
    public static double getCD(int level) {
    if (level < 1 || level > Archers.CD.length)
      return -1;
    return Archers.CD[level - 1];
}
}
