interface In
{
    default void a() {

    }
    
    default void b() {

    }
    
    default void c() {

    }
}
abstract class AB implements In
{
    public void a() {
        System.out.println("in a defined in ab class, function overridden");
    }
}
class PQ extends AB
{
    public void b() {
        System.out.println("in b defined in pq class, function overridden");
    }
    public void c() {
        System.out.println("in c defined in pq class, function overridden");
    }
}
class Demo
{
  public static void main(String args[])
  {
    //AB a1=new AB(); // abstract object instance not possible
    AB a2=new PQ();
    a2.a(); // should give an error, as a is defined in ab but not in pq
    a2.b();
    a2.c();
    PQ p=new PQ();
    p.a(); // it's ok, as pq type stores an pq type object inherited from ab class, so accessing the a() method is ok.
    p.b();
    p.c();
  }
}