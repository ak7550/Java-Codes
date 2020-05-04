class Sample
{
    static int x=2;
    {
        System.out.println("initialization block");
    }
    Sample()
    {
        System.out.println("default cons of sample");
    }
    Sample(int x)
    {
        System.out.println("parameterised cons of sample");
    }
    void show()
    {
        System.out.println("normal show");
    }
}
class Demo
{
    public static void main(String[] args) {
        Sample s=new Sample();
        Sample s1=new Sample(23);
        s.show();
        s1.show();
    }
}