class Account
{
    long accountNumber;
    String holderName;
    double balance;
    public Account(long accountNumber,String holderName,double balance )
    {
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
  void show()
{
System.out.println("AccountNumber "+accountNumber+"HolderName "+holderName+"Balance "+balance);
}
}
class SavingsAccount extends Account
{
 float iR=4;
 SavingsAccount(long accountNumber,String holderName,double balance)
 {
     super(accountNumber,holderName,balance);
 }
 float calculateYearlyInterest()
 {
     return (float) ((balance * iR * 1) / 100); // explicit typecasting
 }
void show()
{
super.show();
System.out.println("AccountNumber "+accountNumber+"HolderName "+holderName+"Balance "+balance+"Yearly interest Rate "+iR);
}
}         
class CurrentAccount extends Account
{       
CurrentAccount(long accountNumber,String holderName,double balance)
{            
    super(accountNumber,holderName,balance);
}
void show()
{
super.show();
System.out.println("AccountNumber "+ accountNumber + "HolderName " + holderName + "Balance" + balance);
}
}  
class Manager
{
int noOfAccount=0;
Account acc[]=new Account[5];
void addAccount(Account b) {
    acc[noOfAccount++] = b;
}
void show()
{
    for (int i = 0; i < acc.length; i++) {
        acc[i].show();
    }
}
}
class Demo
{
 public static void main(String args[])
    {
        Account firstsavingsAcc=new SavingsAccount(12345,"Priyangana",5000);
        Account secondsavingsAcc=new SavingsAccount(23456,"Riya",6000);
        Account firstcurrentAcc=new CurrentAccount(34567,"Priya",7000);
        Account secondcurrentAcc=new CurrentAccount(45678,"Avik",4500);
        Account thirdcurrentAcc=new CurrentAccount(56789,"Akash",5500);
        Manager man=new Manager();
        man.addAccount(firstsavingsAcc);
        man.addAccount(secondsavingsAcc);
        man.addAccount(firstcurrentAcc);
        man.addAccount(secondcurrentAcc);
        man.addAccount(thirdcurrentAcc);
        man.show(); // create show method to display the properties of all the objects accordingly.
        // create addAccount class and overwrite it with both the object type parameter SavingsAccount and CurrentAccount, the way we discussed last time in lab.
    }
}