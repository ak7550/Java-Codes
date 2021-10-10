package inheritance;
class Base
{
    Base(int x)
    {
        System.out.println("Base");
    }
    final void show()
    {
        System.out.println("Using finally at the base class");
    }
}
class Derived extends Base
{
    Derived()
    {
        super(90); // base class constructor must be invoked at the begining of the derived class, otherwise error.
        System.out.println("Derived");
    }
    /*void show() // error of cannot override final method
    {
        System.out.println("show at derived class");
    }*/
}
class kuchvi
{
  public static void main(String args[])
  {
    Derived d=new Derived();
    d.show();
  }
}