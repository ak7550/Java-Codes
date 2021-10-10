package practise;
class Demo
{
    int x=0;
  void change(int sa)
  {
       ++sa;
  }
}
class Demo2
{   
  public static void main(String args[])
  {
      Demo d=new Demo();
      d.change(d.x);
      System.out.println(d.x);
  }
}