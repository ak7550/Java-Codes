class Complex
{
    int real,img;
    Complex()
    {
        real=img=0;
    }
    Complex(int r)
    {
        img=0;
        real=r;
    }
    Complex(int r, int i)
    {
        img=i;
        real=r;
    }
    Complex sum(Complex c)
    {
        Complex n=new Complex();
        n.real=real+c.real;
        n.img=img+c.img;
        return n;
    }
    Complex product(Complex c)
    {
        Complex n=new Complex();
        n.real= real*c.real - img*c.img;
        n.img= real*c.img+img*c.real;
        return n;
    }
    void print()
    {
        System.out.println(real+"+"+img+"i");
    }
    public static void main(String args[])
    {
        Complex a=new Complex(3,2);
        Complex b=new Complex(4,-2);
        a.print();
        b.print();
        a.sum(b).print();
        a.product(b).print();
    }
}