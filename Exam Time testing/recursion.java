package practise;

class recursion
{
    public static void main(String args[])
    {
        int n=10;
        System.out.println(recursion.facto(n));
    }
    static int facto(int n)
    {
        if(n==1||n==0)
            return 1;
        return n*facto(n-1);
    }
}