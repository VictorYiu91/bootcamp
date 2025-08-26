package bank;

public class Bank {
  private Account[] accounts;

  public Bank() {
    this.accounts = new Account[0];
  }

  public int noOfAccount() {
    return this.accounts.length;
  }

  public void add(Account newAccount) {
    Account[] accounts = new Account[this.accounts.length + 1];
    for (int i = 0; i < this.accounts.length; i++) {
      accounts[i] = this.accounts[i];
    }
    accounts[accounts.length - 1] = newAccount;
    this.accounts = accounts;
  }

  // Return Account by username
  public Account findAccount(String username) {
    for (Account account : this.accounts) {
      if (account.getUserName().equals(username)) {
        return account;
      }
    }
    return null;
  }

  public Account findAccount(int accountId) {
    for (Account account : this.accounts) {
      if (account.getId() == accountId) {
        return account;
      }
    }
    return null;
  }
}