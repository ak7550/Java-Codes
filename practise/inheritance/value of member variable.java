package inheritance;
class Base
{
    int value=100;
    Base()
    {
        System.out.println("base");
    }
    void display()
    {
        System.out.println(value);
    }
}
class Child extends Base
{
    int value=50;
    Child()
    {
        System.out.println("child");
    }
    void display()
    {
        System.out.println(value);
    }    
}
class ass
{
  public static void main(String args[])
  {
    Child c=new Child();
    Base b=new Base();
    System.out.println(c.value);
    System.out.println(b.value);
    c.display();
    b.display();
  }
}
