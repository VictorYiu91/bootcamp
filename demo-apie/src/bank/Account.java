package bank;

import java.math.BigDecimal;

public class Account {
  private static int counter = 0;
  private int id;
  private double balance;
  private UserInfo userInfo;
  private Transaction[] transactions;

  // fund transfer -> transaction

  public Account(UserInfo userInfo) {
    this.id = ++counter;
    this.balance = 0.0;
    this.userInfo = userInfo;
    this.transactions = new Transaction[0];
  }

  // ! account -> userInfo
  // because Account.class can be with method to check UserInfo.class
  public boolean validatePassword(String inputtedPassword) {
    return this.userInfo.getPassword().equals(inputtedPassword);
  }

  public void addTransaction(Transaction newTransaction) {
    Transaction[] transactions = new Transaction[this.transactions.length + 1];
    for (int i = 0; i < this.transactions.length; i++) {
      transactions[i] = this.transactions[i];
    }
    transactions[transactions.length - 1] = newTransaction;
    this.transactions = transactions;
  }

  // Arrays.sort()
  public Transaction[] getTransactions() {
    return this.transactions;
  }

  public String getUserName() {
    return this.userInfo.getUserName();
  }

  public int getId() {
    return this.id;
  }

  public double getBalance() {
    return this.balance;
  }

  public void credit(double amount) {
    if (amount <= 0)
      return;
    this.balance = BigDecimal.valueOf(this.balance) //
        .add(BigDecimal.valueOf(amount)) //
        .doubleValue();
    this.addTransaction(new Transaction(this.id, -1, amount));
  }

  public boolean debit(double amount) {
    if (amount <= 0 || amount > this.balance)
      return false;
    this.balance -= amount;
    this.addTransaction(new Transaction(this.id, -1, amount * -1));
    return true;
  }

  // account.fundtransfer(anotherAccount)
  public boolean fundTransfer(Account toAccount, double amount) {
    if (amount <= 0 || !this.debit(amount) || toAccount == null)
      return false;
    toAccount.credit(amount);
    return true;
  }

  public static void main(String[] args) {
    // Account a1 = null;
    // a1.credit(100); // java.lang.NullPointerException
  }
}