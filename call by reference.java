class Demo
{
    int x=0;
    void change(int sa)
    {
        sa++;
    }
}
class demo2
{
  public static void main(String args[])
  {
    Demo d=new Demo();
    System.out.println(d.x);
    d.change(d.x);
    System.out.println(d.x);
  }
}