/**
 * ex1
 */

class Base1 {
    int value = 100;

    Base1() {
        System.out.println("Base constructor");
    }

    public void show() {
        System.out.println(value);
    }
}

class Child extends Base1 {
    int value = 50;

    Child() {
        System.out.println("Child contructor");
    }
    public void show() {
        System.out.println(value);
    }
}
public class ex1 {

    public static void main(String[] args) {
        Child c = new Child();
        Base1 b = new Child();
        System.out.println(c.value);
        System.out.println(b.value);
        c.show();
        b.show();
        // b.toString();
    }
}