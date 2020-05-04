class mc
{
    static int d;
    static
    {
        d=10;
        System.out.println("static block created");
    }
    mc()
    {
        System.out.println("cons");
    }
}
class ass
{
  public static void main(String args[])
  {
    mc m=new mc();
    System.out.println(m.d);
  }
}