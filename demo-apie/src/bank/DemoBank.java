package bank;

import java.util.Scanner;

public class DemoBank {
  public static void main(String[] args) {
    // User can view bank account balance
    // User can credit/ debit his own account
    // User A fund transfer User B (procduce account transaction/history)
    // User can view all account transaction/ history
    // We have only One Bank, but many user
    // A new user comes to open a new bank account
    // The bank account has its own account number
    Bank hsbc = new Bank();
    hsbc.add(new Account(new UserInfo("john1234", "admin1234")));
    hsbc.add(new Account(new UserInfo("lucas999", "admin999")));
    System.out.println(hsbc.noOfAccount());
    System.out.println(hsbc.findAccount("lucas999").getBalance()); // 0.0
    // credit
    hsbc.findAccount("lucas999").credit(120);
    System.out.println(hsbc.findAccount("lucas999").getBalance()); // 120.0

    // Withdrawal (200)
    // Login (password)
    Scanner scanner = new Scanner(System.in);
    String accountUserName;
    String accountUserPassword;
    boolean isUserAccountValid = false;
    boolean isPasswordValid = false;
    boolean isFunctionValid = false;
    Account userAccount = null;

    do {
      // ! Step 1
      if (!isUserAccountValid) {
        System.out.println("Please input your username:");
        accountUserName = scanner.nextLine();
        userAccount = hsbc.findAccount(accountUserName);
        if (userAccount == null) { // ! checking if userAccount is pointing to nothing
          System.out.println("User Account is not found.");
          continue;
        } else {
          isUserAccountValid = true;
        }
      }
      // ! Step 2
      if (!isPasswordValid) {
        System.out.println("Please input your password:");
        accountUserPassword = scanner.nextLine();
        if (!userAccount.validatePassword(accountUserPassword)) {
          System.out.println("Password is incorrect.");
          continue;
        } else {
          isPasswordValid = true;
        }
      }
      // ! Step 3
      // 2 Functions: Withdraw or Fund Transfer (Auto-logout after either transaction)
      if (!isFunctionValid) {
        System.out.println(
            "Withdrawal or Fund Transfer? Input 1 for Withdrawal; 2 for Fund Transfer; 3 Logout");
        String funtion = scanner.nextLine();
        int functionInteger = Integer.valueOf(funtion);
        if (functionInteger == 1) {
          System.out.println("Please input an amount:");
          String amount = scanner.nextLine();
          int amountToWithdraw = Integer.valueOf(amount);
          if (!userAccount.debit(amountToWithdraw)) {
            System.out.println("Insufficient balance.");
            break;
          }
          System.out.println("Withdrawal success. Outstanding Balance=" + userAccount.getBalance());
          isFunctionValid = true;
          break;
        } else if (functionInteger == 2) {
          System.out
              .println("Please input an account number for fund transfer:");
          String toAccountNumStr = scanner.nextLine();
          int toAccountNum = Integer.valueOf(toAccountNumStr);
          Account toAccount = hsbc.findAccount(toAccountNum);
          if (toAccount == null) {
            System.out.println("Invalid account number.");
            continue;
          }
          System.out.println("Input the fund transfer amount:");
          String amount = scanner.nextLine();
          int amountToTransfer = Integer.valueOf(amount);
          if (!userAccount.fundTransfer(toAccount, amountToTransfer)) {
            System.out.println("Error. Please try again later.");
            break;
          }
          System.out.println("Fund Transfer success. Outstanding Balance=" + userAccount.getBalance());
          isFunctionValid = true;
          break;
        } else if (functionInteger == 3) {
          System.out.println("Logout success.");
          isFunctionValid = true;
          break;
        } else {
          System.out.println("Wrong Option Selected.");
          continue;
        }
      }
    } while (true);
    System.out.println("Thank you for using our service.");
    scanner.close();

    System.out.println(hsbc.findAccount("lucas999").getBalance());
    System.out.println(hsbc.findAccount("john1234").getBalance());
  }
}