import java.util.Scanner;
class Book
{
    String name, authors[],publisher,e="Enter the ",n="name";
    int page,no_author;
    float price;
    Scanner myobj=new Scanner(System.in);
    Book()
    {
        modify();
    }
    void modify()
    {
        System.out.println(e+n+" of the book: ");
        name=myobj.next();
        System.out.println(e+"number of authors: ");
        no_author=myobj.nextInt();
        authors=new String[no_author];
        System.out.println("Enter the name of "+no_author+" authors one by one: ");
        for (int i = 0; i <no_author; i++)          
            authors[i]=myobj.next();
        System.out.println(e+"publisher name: ");
        publisher=myobj.next();
        System.out.println(e+"number of pages: ");
        page=myobj.nextInt();
        System.out.println(e+"price of the book: ");
        price=myobj.nextFloat();
    }
    String getAuthors()
    {
        String s="\n";
        for (int i = 0; i < authors.length; i++) 
            s=s.concat((i+1)+")"+authors[i]+"\n");
        return s;
    }
    String getData()
    {
        return "Name of the book is: "+name+"\nName of the Authors are: "+getAuthors()+"\nName of the publisher is: "+publisher+"\nNo of Pages: "+page+"\nPrice of the book is: "+price;
    }
}
class Library
{
    Book books[];
    Scanner myobj=new Scanner(System.in);
    void add_book(int index)
    {
        books[index]=new Book(); // invoking the default constructor.
    }
    public static void main(String arg[])
    {
        Library li=new Library();    
        li.books=new Book[5]; // array of 5 books has asked to create.
        for (int i = 0; i < 5; i++) 
            li.add_book(i);
        for (int i = 0; i < 5; i++) 
            li.print_book(i);
        li.remove();
        for (int i = 0; i < 5; i++) 
            li.print_book(i);
        System.out.println("The total price of all the remaining books is: "+li.countTotalPrice(li.books));
    }
    float countTotalPrice(Book b[])
    {
        float total=0;
        for (int i = 0; i < b.length; i++) {
            total+=b[i].price;
        }
        return total;
    }
    void print_book(int index)
    {
        System.out.println(books[index].getData());
    }
    void remove()
    {
        int index=search();
        if(index==-1)
            System.out.println("The provided book doesnot exist under this Library.");
        else
        {
            System.out.println(books[index].getData()+"is removed.");
            books=removeObject(books,index);
        }
    }
    Book[] removeObject(Book acc[], int index)
    {
        Book newarray[]= new Book[acc.length-1];
        for (int i = 0, k=0; i < acc.length; i++)
        {
            if(i==index)
            continue;
            newarray[k++]=acc[i];
        }
        return newarray;
    }
    int search()
    {
        String a="Press";
        String b="to get index from ";
        System.out.println(a+" 1 "+b+"Book Name.");
        System.out.println(a+" 2 "+b+"Index.");
        System.out.println("Enter your choice: ");
        int ch=myobj.nextInt();
        switch(ch)
        {
            case 1:
            return getfromBookName();
            case 2:
            return getIndex();
            default:
            System.out.println("Wrong Input!");
            return -1;
        }
    }
    int getfromBookName()
    {
        System.out.println("Enter the Book Name: ");
        String str=myobj.next();
        for (int i = 0; i < books.length; i++) 
            if(str==books[i].name)    
                return i;
        return -1;
    }
    int getIndex()
    {
        System.out.println("Enter the Index of the book: ");
        int in=myobj.nextInt();
        if(in>=books.length||in<0) // index can't be larger than accounts length.
        return -1;
        else
        return in;
    }
}

