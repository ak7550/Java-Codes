import java.util.Random;

class Ran extends Random {
  private static final long serialVersionUID = 1L;
  String s = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
  Random rand = new Random();

  String getString(int max) {
    StringBuilder str = new StringBuilder(max);
    for (int i = 0; i < rand.nextInt(max); i++)
      str.append(s.charAt(rand.nextInt(s.length())));
    if (str.length() == 1 || str.length() == 0)
      getString(max);
    return str.toString();
  }
}

class Account {
  int accountNumber, balance;
  double interest = 0;
  Ran rand = new Ran();
  String holderName;

  Account() {
    balance = rand.nextInt(10000000);
    accountNumber = rand.nextInt(100000);
    holderName = rand.getString(20);
  }

  Account(int b, int a, String h) {
    balance = b;
    accountNumber = a;
    holderName = h;
  }

  void addBalance(int amt) {
    balance += amt;
  }

  void debit(int amt) {
    if (amt > balance)
      System.out.println(amt + "/- is not present in this account.");
    else
      balance -= amt;
  }

  void details() {
    System.out.println("Name: " + holderName + "\nAccount Number: " + accountNumber + "\nBalance: " + balance);
  }
}

class SavingsAccount extends Account {
  // saving accounts interest rate should be same for all the members in bank.
  int interestRate = new Ran().nextInt(7);

  double calculateYearlyInterest() {
    return balance * interestRate * .01;
  }

  SavingsAccount() {
    super();
  }

  SavingsAccount(int b, int a, String h) {
    super(b, a, h);
  }

  void details() {
    System.out.println("\nSavings Account Details: ");
    System.out.println("============================");
    super.details();
    System.out.println("Yearly Interest: " + calculateYearlyInterest());
  }
}

class CurrentAccounts extends Account {
  CurrentAccounts() {
    super();
  }

  CurrentAccounts(int b, int a, String h) {
    super(b, a, h);
  }

  void details() {
    System.out.println("\nCurrent Account Details: ");
    System.out.println("============================");
    super.details();
  }
}

class Manager {
  int noOfAccounts = 0, capacity;
  Account acc[];

  Manager(int n) {
    capacity = n;
    acc = new Account[n];
  }

  void add(SavingsAccount b) {
    if (noOfAccounts >= capacity) {
      // b.display();
      System.out.println("\nCannot be added under this Manager.\nNo more space available.");
    } else
      acc[noOfAccounts++] = b; // reference has been stored into the array.
  }

  void add(CurrentAccounts b) {
    if (noOfAccounts >= capacity) {
      // b.display();
      System.out.println("\nCannot be added under this Manager.\nNo more space available.");
    } else
      acc[noOfAccounts++] = b; // reference has been stored into the array.
  }

  void printDetails() {
    for (Account account : acc)
      account.details();
  }
}

class ass12 {
  public static void main(String arg[]) {
    Manager m = new Manager(5);
    Ran rand = new Ran();
    // Interest rate should be same for all the accounts in bank.
    // Add two SavingsAccount and three CurrentAccount to Manager.
    m.add(new SavingsAccount(rand.nextInt(1000000), rand.nextInt(5000), rand.getString(20)));
    m.add(new SavingsAccount());
    m.add(new CurrentAccounts());
    m.add(new CurrentAccounts());
    m.add(new CurrentAccounts(rand.nextInt(1000000), rand.nextInt(5000), rand.getString(20)));
    m.printDetails();
  }
}