class Base
{
    void show() {
        System.out.println("base");
    }
}
class Child extends Base
{
    public void show() {
        System.out.println("child");
        super.show(); // acessible of the private methods are not possible outisde the class
    }
}
class GrandChild extends Child
{
    public void show() {
        System.out.println("grand child");
        super.show(); // accessing the child class show
        //super.super.show(); // accessing the base class show, that is not possible
    }
}
class Main
{
  public static void main(String args[])
  {
   // Base b1=new Base();
    //b1.show(); // acessible of the private methods are not possible outisde the class
    //Base b2=new Child();
    //b2.show(); // protected data members access outside the class as well as overriding both are possible.
    Child c=new Child();
    c.show();
    GrandChild gc=new GrandChild();
    gc.show();
  }
}