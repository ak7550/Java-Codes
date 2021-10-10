package inheritance;
class Base
{
    private  void show() //protected access specifier in base class is possible, it's overiding is also possible.
    {
        System.out.println("in base");
    }
}
class Derived extends Base
{
    public void show() //protected access specifier is not possible in derives class for method overriding.
     {
        System.out.println("in derived");
        // super.show(); //=> keeping the access modifier show of the base class private, means it'll wont be accessbile neither with the help of super keyword too.
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