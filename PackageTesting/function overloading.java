class Base
{
    private void show(int x) {
        System.out.println("in base");
    }
}
class Child extends Base
{
    public void show(double y) {
        System.out.println("in child");
        super.show(20); // not possible as private member are not accessible out the class
    }
}
class ass
{
  public static void main(String args[])
  {
    Child c=new Child();
    c.show(12);
  }
}