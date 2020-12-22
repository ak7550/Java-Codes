public class ex4 {
    public static void main(String[] args) {
        Base2 b1 = new Child2();
        // b1.serious();
        Child2 ch2 = new Child2();
        ch2.serious();
        Base2 bs1 = new Base2();
    }
}

abstract class Base2{
    abstract void show();

    Base2() {
        System.out.println("default constructor");
    }

    Base2(int x) {
        System.out.println("parameterised constructor");
    }

    void display() {
        System.out.println("in base 2");
    }
}

class Child2 extends Base2 {
    void show() {
        System.out.println("Show method of Child");
    }

    Child2() {
        super(15);
        System.out.println("default child contructor");
    }

    void serious() {
        System.out.println("serious named method of child2");
    }
}