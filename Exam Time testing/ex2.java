public class ex2 {
    public static void main(String[] args) {
        Base c = new Child1();
        Base bgc = new GrandChild();
        Child1 ch1 = new Child1();
        GrandChild gch = new GrandChild();
        Child1 chch = new GrandChild();
        Base bs = new Base();
        c.show();
        bs.show();
        chch.show();
    }
}

class Base {
    public Base(){
        System.out.println("Base contructor");
    }
    public void show() {
        System.out.println("Base");
    }
}

class Child1 extends Base {
    public Child1() {
        System.out.println("child contructor");
    }
    public void show() {
        super.show();
        System.out.println("Child");
    }
}

class GrandChild extends Child1 {
    public GrandChild() {
        System.out.println("Grandchild constructor");
    }
    
    public void show() {
        super.show();
        // super.show();
        System.out.println("GrandChild");
    }
}