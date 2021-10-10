package practise;
class Factorial
{
    int N=12;
    public static void main(String arg[])
    {
        Factorial f=new Factorial();
        System.out.println("\n"+f.digitinFacto());
    }
    int digitinFacto()
    {
        int arr[]=new int[100],ceiling=0;
        while (N!=0) 
        {
            arr[ceiling++]=N%10;
            N/=10;
        }
        //N is inserted into the arr.
        printarr(arr,ceiling);
        for (int i = 2; i < N; i++) 
        {
            int rem=0;
            for (int j = 0; j < ceiling; j++) 
            {
                int mul=arr[j]*i+rem;    
                arr[j]=mul%10;
                rem=mul/10;
            }    
            while (rem!=0)
            {
                arr[ceiling++]=rem%10;
                rem/=10;    
            }
        }
        printarr(arr, ceiling);
        return ceiling;//think before placing +1
    }
    void printarr(int arr[], int N)
    {
        System.out.println("\nIn printarray function.");
        for (int i = 0; i < N; i++) 
            System.out.print(arr[i]);
    }
}