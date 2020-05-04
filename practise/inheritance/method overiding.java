package inheritance;
class Base
{
    protected void show() //protected access specifier in base class is possible, it's overiding is also possible.
    {
        System.out.println("in base");
    }
}
class Derived extends Base
{
    public void show() //protected access specifier is not possible in derives class for method overriding.
     {
        System.out.println("in derived");
        super.show();
    }
}
class ass
{
  public static void main(String args[])
  {
    Derived b=new Derived();
    b.toString();
    b.show();
  }
}