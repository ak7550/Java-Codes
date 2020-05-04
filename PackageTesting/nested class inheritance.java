class Outer
{
    private String s1="ju";
    private void show() {
        System.out.println("outer");
    }
    class Inner  extends Outer
    {
        private void show() {
            System.out.println("inner");
        }
    }
    public static void main(String[] args) {
        Outer ob=new Outer();
        Inner in=ob.new Inner();
        ob.show(); // outer
        in.show(); // inner
        ob=in; // reference passing to the parent class
        ob.show(); // outer
        Inner ic= (new Outer()).new Inner();
        ic.show();//inner
    }
}