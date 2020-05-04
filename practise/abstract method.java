abstract class Publication
{
    abstract void show();
}
class Book extends Publication
{
    void show()
    {
        System.out.println("Inside book");
    }
}
class Journal extends Publication
{
    void show()
    {
        System.out.println("Inside journal");
    }
}
class absmethod
{
  public static void main(String args[])
  {
    Publication pub[]=new Publication[5];
    for (Publication publication : pub)
    {
        publication=new Journal();
        publication.show();
    } 
  }
}