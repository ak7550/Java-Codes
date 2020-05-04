abstract class Base
{
    Base()
    {
        System.out.println("base cons");
    }
    Base(int x)
    {
        System.out.println("parameterised base cons");
    }
    abstract void show();
}
class Child extends Base
{
    Child()
    {
        System.out.println("child cons");
    }
    Child(int x)
    {
        super(x);
        System.out.println("parameterised child cons");
    }
    void show()
    {
        System.out.println("child show");
    }
}
class Demo
{
  public static void main(String args[])
  {
    Base b1=new Child();
    Base b2=new Child(90);
    b1.show();
    b2.show();
  }
}