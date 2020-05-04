import java.util.Scanner;
import java.lang.Math;


class DigitCountInFact
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println(Math.log10(i));
            sum=(sum+Math.log10(i));
            System.out.println(sum);
            // System.out.println(sum);
            System.out.println(Math.floor(sum));
        }
        
    }
}