import java.util.Random;
class Ran extends Random
{
    private static final long serialVersionUID = 1L;
    String s = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
    Random rand=new Random();
    String getString(int max)
    {
        StringBuilder str=new StringBuilder(max);
        for (int i = 0; i <rand.nextInt(max); i++)
            str.append(s.charAt(rand.nextInt(s.length())));
        if(str.length()==1|| str.length()==0)
            getString(max);
        return str.toString();
    }
}
abstract class Publication
{
    int noOfPages, price;
    String publisherName;
    Ran rand=new Ran();
    Publication()
    {
        noOfPages=rand.nextInt(5000);
        price=rand.nextInt(4000);
        publisherName=rand.getString(20);
    }
    Publication(int n, int p, String pub)
    {
        noOfPages=n;
        price=p;
        publisherName=pub;
    }
    void display()
    {
        System.out.println("Publisher Name: "+publisherName+"\nPrice: "+price+"\nNo of Pages: "+noOfPages);
    }
}
class Book extends Publication
{
    String bookName, authorName;
    Ran rand=new Ran();
    Book()
    {
        super();
        bookName=rand.getString(20);
        authorName=rand.getString(20);
    }
    Book(int n, int p, String pub, String bk, String au)
    {
        super(n,p,pub);
        bookName=bk;
        authorName=au;
    }
    Book(String bk, String au)
    {
        super();
        bookName=bk;
        authorName=au;
    }
    Book(int n, int p, String pub)
    {
        super(n, p, pub);
        bookName=rand.getString(20);
        authorName=rand.getString(20);
    }
    void display()
    {
        System.out.println("\nBook Description: ");
        System.out.println("=====================");
        System.out.println("Book Name: "+bookName+"\nAuthor Name: "+authorName);
        super.display();
    }
}
class Journal extends Publication
{
    String jName, authorName;
    Journal()
    {
        super();
        jName=rand.getString(20);
        authorName=rand.getString(20);
    }
    Journal(String j, String a)
    {
        super();
        jName=j;
        authorName=a;
    }
    Journal(int n, int p, String pub)
    {
        super(n,p,pub);
        jName=rand.getString(20);
        authorName=rand.getString(20);
    }
    Journal(int n, int p, String pub, String a, String j)
    {
        super(n, p, pub);
        jName=j;
        authorName=a;
    }
    void display()
    {
        System.out.println("\nJournal Description: ");
        System.out.println("=======================");
        System.out.println("Journal Name: "+jName+"\nAuthor Name: "+authorName);
        super.display();
    }
}
class Library
{
    Publication pub[];
    int noOfCopy=0;
    int maxnoOfCopy;
    Library(int no)
    {
        pub=new Publication[no];
        maxnoOfCopy=no;
    }
    void add(Book b)
    {
        if(noOfCopy>=maxnoOfCopy)
        {
            b.display();
            System.out.println("\nCannot be added into the library.\nNo more space available.");
        }
        else
            pub[noOfCopy++]=b; // reference has been  stored into the array.
    }
    void add(Journal b)
    {
        if(noOfCopy>=maxnoOfCopy)
        {
            b.display();
            System.out.println("\nCannot be added into the library.\nNo more space available.");
        }
        else
            pub[noOfCopy++]=b; // reference has been  stored into the array.
    }
}
class ass11
{
  public static void main(String args[])
  {
    Library l=new Library(5);
    Ran rand=new Ran();
    // 3 books and 2 jounral need to be added into the library.
    l.add(new Book(rand.getString(20), rand.getString(30)));
    l.add(new Book(rand.nextInt(5000),rand.nextInt(2000),rand.getString(40),rand.getString(20), rand.getString(30)));
    l.add(new Book());
    l.add(new Journal(rand.getString(20), rand.getString(30)));
    l.add(new Journal(rand.nextInt(5000),rand.nextInt(2000),rand.getString(40),rand.getString(20), rand.getString(30)));
    l.add(new Journal());
    // printing all the data.
    for (Publication p : l.pub)
        p.display();
   }
}