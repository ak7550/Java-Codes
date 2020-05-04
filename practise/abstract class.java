
import java.util.Random;
abstract class Demo
{
    Random rand=new Random();
    String s="1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
    String getString(int max)
    {
        StringBuilder str=new StringBuilder(max);
        for (int i = 0; i <rand.nextInt(max); i++)
            str.append(s.charAt(rand.nextInt(s.length())));
        System.out.println(str);
        return str.toString();
    }
}
class Demo2 extends Demo
{
    String sp;
    Demo2()
    {
     // creating a new object infinity times.
        sp=getString(20);
        System.out.println(sp);
    }
    void d()
    {
        System.out.println(sp);
    }
}
class abs
{
  public static void main(String args[])
  {
    Demo2 d=new Demo2();
    d.d();
  }
}