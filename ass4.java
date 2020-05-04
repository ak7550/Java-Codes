class Stack
{
    int arr[],i,n;
    Stack(int ni)
    {
        arr=new int[ni];
        i=0;
        n=ni;
    }
    void push(int a)
    {
        if(n==i-1)
            System.out.println("The Stack is Full.\n Pushing a new element is not possible.");
        arr[i++]=a;
    }
    int pop()
    {
        if(i==0)
        {
            System.out.println("The Stack is empty.\n Popping is not possible.");
            return -1;
        }
        else
            return arr[--i];
    }
    void print()
    {
        for(int j=0;j<i;j++)
        System.out.println(arr[j]);
    }
    public static void main(String args[])
    {
        Stack s1=new Stack(30);
        s1.push(30);
        s1.push(15);
        s1.push(20);
        s1.push(9);
        s1.push(10);
        s1.print();
        System.out.println(s1.pop()+"Deleted.");
        System.out.println(s1.pop()+"Deleted.");
        System.out.println(s1.pop()+"Deleted.");
        s1.print();
    }
}