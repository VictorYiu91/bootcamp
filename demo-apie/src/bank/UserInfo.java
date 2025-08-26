package bank;

// User = Bank User
public class UserInfo {
  private String username;
  private String password;
  
  public UserInfo(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUserName() {
    return this.username;
  }

  public String getPassword() {
    return this.password;
  }
}