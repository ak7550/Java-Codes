package practise;
public class find_missing {

    public static void main(String args[])
    {
        int arr[]={1,5,3,2};
        System.out.println("The missing one is: "+find_missing.find(arr,arr.length));
    }
    public static int find(int a[], int n)
    {
        int res=0;
        for(int i=0;i<n;i++)
            res=res^a[i];
        for (int i = 1; i <=a.length+1; i++)
            res=res^i;
        return res;
    }
}