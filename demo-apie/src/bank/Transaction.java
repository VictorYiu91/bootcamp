package bank;

import java.time.LocalDate;
import java.time.LocalDateTime;

// ! Assume we have FUND TRANSFER, Credit, Debit ONLY
public class Transaction {
  // attirbute
  private static int idCounter = 0;
  private int id;
  private LocalDateTime tranDateTime;
  private int fromAccountId; // int accountId
  private int toAccountId;
  private double amount;

  public Transaction(int fromAccountId, int toAccountId, double amount) {
    this.id = ++idCounter;
    this.tranDateTime = LocalDateTime.now();
    this.fromAccountId = fromAccountId;
    this.toAccountId = toAccountId;
    this.amount = amount;
  }


}