import AkPackage.Ran;
import java.util.Scanner;
class Bookshop
{
    String author, title, publisher;
    int stockPosition;
    float cost;
    Bookshop(String a, String t, String p, int s, float c)
    {
        author=a;
        title=t;
        publisher=p;
        stockPosition=s;
        cost=c;
    }
}
class ass16
{
  public static void main(String args[])
  {
    Bookshop bs[]=new Bookshop[5]; //each object is containing the information regarding a book.
    // so we must take a an array of object under this class.
    // initialise the values of the objects.
    Ran ran=new Ran();
    bs[0]=new Bookshop("a0", "t0", ran.getString(20), ran.nextInt(500), ran.nextFloat()*800);
    bs[1]=new Bookshop("a1", "t1", ran.getString(20), ran.nextInt(500), ran.nextFloat()*800);
    bs[2]=new Bookshop("a2", "t2", ran.getString(20), ran.nextInt(500), ran.nextFloat()*800);
    bs[3]=new Bookshop("a3", "t3", ran.getString(20), ran.nextInt(500), ran.nextFloat()*800);
    bs[4]=new Bookshop("a4", "t4", ran.getString(20), ran.nextInt(500), ran.nextFloat()*800);
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter the name os the book: ");
    String nm=obj.nextLine();
    System.out.print("Enter the Author of the book: ");
    String au=obj.nextLine();
    Bookshop result= searchBook(nm, au, bs);
    if(result!=null)
    {
        System.out.println(result.title+" detials:");
        System.out.println("==========================");
        System.out.println("Name: "+result.title);
        System.out.println("Author: "+result.author);
        System.out.println("Publisher: "+result.publisher);
        System.out.println("Cost: "+result.cost);
        System.out.println("No of remainaing copies: "+result.stockPosition);
        System.out.print("Your required number of copies: ");
        int need=obj.nextInt();
        if(need>result.stockPosition)
        System.out.println("Required copies are not in stock.");
        else
        System.out.println("Required copies are present in stock.\nTotal cost for all of those copies will be: "+result.cost*need);
    }
    else
    System.out.println("The Book "+nm+" written by "+au+" is not present in our stock.");
    obj.close();
  }

  static Bookshop searchBook(String nm, String au, Bookshop[] bs)
  {
    for (Bookshop bookshop : bs) {
        if(nm.equalsIgnoreCase(bookshop.title))
            if(au.equalsIgnoreCase(bookshop.author))
                return bookshop;
    }
    return null;
  }
}