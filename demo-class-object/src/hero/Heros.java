package hero;

// ! final class -> cannot be extended
public final class Heros {
  public static final int[] MAX_HP =
      new int[] {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
  public static final int[] MAX_MP =
      new int[] {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
  public static final int[] PHY_ATTACK =
      new int[] {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
  public static final int[] PHY_DEFENSE =
      new int[] {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
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

  public static int getPAtk(int level) {
    if (level < 1 || level > Heros.MAX_HP.length)
      return -1;
    return Heros.PHY_ATTACK[level - 1];
  }

  public static double calcAddedExp(int killedheroLevel) {
    return Heros.EXP_GAINED[killedheroLevel - 1];
  }

}
