package practise;
public class kthbit {

    public static void main(String args[])
    {
        int n=4,k=2;
        System.out.println(kthbit.bit(n,k));
    }
    static Boolean bit(int n, int k)
    {
        int res= n & (1<<k);
        if(res!=0)
            return true;
        else
            return false;    
    }
}