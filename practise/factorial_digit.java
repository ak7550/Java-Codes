package practise;
public class factorial_digit {

    public static void main(String arg[])
    {
        int N=42;
        System.out.println(factorial_digit.digit_facto(N));
    }
    public static int digit_facto(int n)
    {
        double dis=0;
        for (double i = 2; i <=n; i++) 
            dis+=Math.log10(i);
        return (int)Math.floor(dis)+1;
    }
}