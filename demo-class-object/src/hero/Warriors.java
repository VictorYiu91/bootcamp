package hero;

public final class Warriors {
  public static final int[] MAX_HP_MODIFIER =
      new int[] {30, 30, 30, 45, 45, 50, 50, 55, 55, 60};
  public static final int[] MAX_MP_MODIFIER =
      new int[] {10, 10, 10, 25, 25, 30, 30, 35, 35, 40};
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
      new int[] {-7, -7, -7, -7, -4, -4, -1, -1, 0, 0};
  public static final double[] CD =
      new double[] {1.5, 1.8, 1.8, 2.0, 2.0, 2.2, 2.3, 2.4, 2.5, 3.0};

  public static int getMaxHpMod(int level) {
    if (level < 1 || level > Warriors.MAX_HP_MODIFIER.length)
      return -1;
    return Warriors.MAX_HP_MODIFIER[level - 1];
  }

  public static int getMaxMpMod(int level) {
    if (level < 1 || level > Warriors.MAX_MP_MODIFIER.length)
      return -1;
    return Warriors.MAX_MP_MODIFIER[level - 1];
  }

  public static int getPAMod(int level) {
    if (level < 1 || level > Warriors.PA_MODIFIER.length)
      return -1;
    return Warriors.PA_MODIFIER[level - 1];
  }

  public static int getPDMod(int level) {
    if (level < 1 || level > Warriors.PD_MODIFIER.length)
      return -1;
    return Warriors.PD_MODIFIER[level - 1];
  }

  public static int getMAMod(int level) {
    if (level < 1 || level > Warriors.MA_MODIFIER.length)
      return -1;
    return Warriors.MA_MODIFIER[level - 1];
  }

  public static int getMDMod(int level) {
    if (level < 1 || level > Warriors.MD_MODIFIER.length)
      return -1;
    return Warriors.MD_MODIFIER[level - 1];
  }

  public static int getAGMod(int level) {
    if (level < 1 || level > Warriors.AG_MODIFIER.length)
      return -1;
    return Warriors.AG_MODIFIER[level - 1];
  }

  public static int getCCMod(int level) {
    if (level < 1 || level > Warriors.CC_MODIFIER.length)
      return -1;
    return Warriors.CC_MODIFIER[level - 1];
  }
    public static double getCD(int level) {
    if (level < 1 || level > Warriors.CD.length)
      return -1;
    return Warriors.CD[level - 1];
  }
}
