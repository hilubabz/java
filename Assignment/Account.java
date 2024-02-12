

public class Account {
  String customer_name, account_type;
  int account_number, balance;

  public Account(String customer_name, int account_number, String account_type) {
    this.customer_name = customer_name;
    this.account_number = account_number;
    this.account_type = account_type;
    this.balance = 0; // Initialize the balance to 0 or any other initial value
  }

  void display() {
    System.out.println("Account Balance: Rs" + balance);

  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposit of R" + amount + " successful.");
    } else {
      System.out.println("Invalid deposit amount.");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawal of Rs" + amount + " successful.");
    } else {
      System.out.println("Invalid withdrawal amount or insufficient funds.");
    }
  }

  public static void main(String[] args) {

    Account myAccount = new Account("John ", 123456789, "Savings");

  }
}

class SavingAccount extends Account {
  public SavingAccount(String customer_name, int account_number, String account_type) {
    super(customer_name, account_number, account_type);

  }

  public static void main(String[] args) {
    SavingAccount s1 = new SavingAccount("Ram Bhadur", 987654321, "Savings");
    s1.deposit(29999);
    s1.withdraw(1234);

    s1.display();
  }
}