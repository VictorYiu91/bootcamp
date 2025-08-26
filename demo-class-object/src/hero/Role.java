package hero;

public class Role {
  public static final String[] ROLES =
      new String[] {"Warrior", "Archer", "Mage"};
  private boolean isWarrior;
  private boolean isArcher;
  private boolean isMage;
  private String roleName;

  public Role(int idx) {
    this.roleName = ROLES[idx];
    this.isWarrior = idx == 0;
    this.isArcher = idx == 1;
    this.isMage = idx == 2;
  }

  public String getRoleName() {
    return this.roleName;
  }

  public boolean isWarrior() {
    return this.isWarrior;
  }

  public boolean isArcher() {
    return this.isArcher;
  }
  public boolean isMage() {
    return this.isMage;
  }
  public static void main(String[] args) {
  }
}
