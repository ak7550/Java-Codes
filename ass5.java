import java.util.Scanner;
class BankAccount
{
    int accno;
    float bal;
    String owner;
    Scanner myobj= new Scanner(System.in);
    BankAccount(String arg, int acc, float ba)
    {
        owner=arg;
        accno=acc;
        bal=ba;
    }
    BankAccount() // default constructor.
    {
        System.out.println("Enter the name of the owner: ");
        owner=myobj.nextLine();
        System.out.println("Enter the Account Number: ");
        accno=myobj.nextInt();
        bal=0;
    }
    void deposit(float amt)
    {
        bal+=amt;
    }
    void withdraw(float amt)
    {
        if(amt>bal)
            System.out.println("Only "+bal+" amount is present into the account. You can't withdraw more than this.");
        else
            bal-=amt;
    }
    String getData()
    {
        return "Owner: "+owner+" AccountNumber: "+accno+" Balance: "+bal;
    }
}
class AccountManager
{
    BankAccount accounts[]=new BankAccount[100]; //currently it's not pointing to an array of 100 objects. Those objects are not pointing to anywhere.
    int last=0,size;
    Scanner myobj=new Scanner(System.in);
    AccountManager(int no)
    {
        size=no;
    }
    AccountManager()
    {
        System.out.println("Call to the default constructor.");
    }
    /*void create()
    {
        // initialize the objects into the array one by one and then define the values.
        Scanner myobj= new Scanner(System.in);
        System.out.println("Enter the name of the owner: ");
        accounts[last].owner=myobj.nextLine();
        System.out.println("Enter the AccountNumber: ");
        accounts[last].accno=myobj.nextInt();
        accounts[last].bal=0;
        last++;
        myobj.close();
    }*/


    BankAccount[] removeObject(BankAccount acc[],int index)
    {
        BankAccount[] newarray=new BankAccount[acc.length-1];//remember tis method is important.
        for (int i = 0, k=0; i < acc.length; i++)
        {
            if(i==index)
            continue;
            newarray[k++]=acc[i];
        }
        last=newarray.length;
        return newarray;
    }
    void deposit()
    {
        int index=search();
        System.out.println("Enter the amount to deposit: ");
        int amt=myobj.nextInt();
        accounts[index].deposit(amt);
    }
    void withdraw()
    {
        int index=search();
        System.out.println("Enter the amount to withdraw: ");
        int amt=myobj.nextInt();
        accounts[index].withdraw(amt);
    }

    int search()
    {
        String a="Press";
        String b="to get index from ";
        System.out.println(a+" 1 "+b+"AccountNumber.");
        System.out.println(a+" 2 "+b+"Ownername.");
        System.out.println(a+" 3 "+b+"Index.");
        System.out.println("Enter your choice: ");
        int ch=myobj.nextInt();
        switch(ch)
        {
            case 1:
            return getfromAcc();
            case 2:
            return getfromOwner();
            case 3:
            return getIndex();
            default:
            System.out.println("Wrong Input!");
            return -1;
        }
    }
    void delete()
    {
        int index=search();
        if(index==-1)
            System.out.println("The provided account doesnot exist under this Account Manager.");
        else
        {
            System.out.println(accounts[index].getData());
            accounts=removeObject(accounts,index);
        }
    }
    int getfromAcc()
    {
        System.out.println("Enter the Accountnumber: ");
        int a=myobj.nextInt();
        for (int i = 0; i < accounts.length; i++) 
            if(a==accounts[i].accno)    
                return i;
        return -1;
    }
    int getfromOwner()
    {
        System.out.println("Enter the OwnerName: ");
        String a=myobj.nextLine();
        myobj.close();
        for (int i = 0; i < accounts.length; i++) 
            if(a.equals(accounts[i].owner))    
                return i;
        return -1;
    }
    int getIndex()
    {
        System.out.println("Enter the Index of the account: ");
        int in=myobj.nextInt();
        if(in>=accounts.length||in<0) // index can't be larger than accounts length.
        return -1;
        else
        return in;
    }
}
class ass5
{
    public static void main(String args[])
    {
        AccountManager accm=new AccountManager();
        for (int i = 0; i < 5; i++) // it's asked to create 5 objectes.
            accm.accounts[i]=new BankAccount();//invoking the default constructor.
            //accm.create();
        // printing the details of all the accounts.
        for (int i = 0; i < 5; i++) 
            System.out.println(accm.accounts[i].getData());
    }
}