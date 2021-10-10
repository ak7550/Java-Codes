package practise;
class X
{
    int i=4;
}
public class reference_object {

    public static void main(String args[])
    {
        X s1=new X();
        fun(s1);
        System.out.println("s1.i==>"+s1.i);
        X s2=s1;
        s2.i=6;
        System.out.println(s1.i);
    }
    public static void fun(X s)
    {
        System.out.println("s.i==>"+s.i);
        s.i=6;
        System.out.println("s.i==>"+s.i);
    }
}