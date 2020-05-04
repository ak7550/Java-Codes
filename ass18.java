interface Fruit
{    
    void hasAPeel();
}
interface Vegetable
{    
    void hasARoot();
}
class Tomato implements Fruit, Vegetable
{
    String name;
    Boolean peel, root;
    Tomato(String n, boolean p, boolean r)
    {
        name=n;
        peel=p;
        root=r;
    }
    public void hasAPeel() 
    {
        if(peel)
            System.out.println(name+" has a Peel");
        else
            System.out.println(name+" has not any Peel");
    }
    public void hasARoot() {
        if(root)
        System.out.println(name+" has a Root");
        else
        System.out.println(name+" has not any Root");
    }
}
class ass18
{
  public static void main(String args[])
  {
    Tomato t=new Tomato("tomato",true,false);
    t.hasAPeel();
    t.hasARoot();
  }
}