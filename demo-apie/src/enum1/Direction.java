package enum1;

public enum Direction {
  EAST(-1), SOUTH(-2), WEST(1), NORTH(2),;
  // 4 Direction
  // oppostie()
  private int value;

  private Direction(int value){
    this.value = value;
  }
  private int getValue(){
    return this.value;
  }

  public Direction opposite() {
    for (Direction d : values()) {
      if (isOpposite(d, this))
      return d;
    }
    return null;
  }

  // static isOpposite()
  public static boolean isOpposite(Direction d1, Direction d2) {
      return d1.getValue() * -1 == d2.getValue();
  }

    public static Direction valueOf(int value) {
    for (Direction d : Direction.values()) {
      if (d.getValue() == value)
        return d;
    }
    return null;
  }
}
