class Base
{
    void show()
    {
        System.out.println("in base"); // will get invoked if the child method is not defined.
    }
}
class Child extends Base
{
    void show()
    {
        System.out.println("in child"); // after overiding the child method will get called
    }
}
class Demo
{
  public static void main(String args[])
  {
    Base b=new Child();
    b.show();
  }
}