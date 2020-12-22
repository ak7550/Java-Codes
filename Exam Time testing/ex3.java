interface IG {
    void show3();

    
}

interface I1 extends IG {
    void show1();
}

interface I2 extends IG {
    void show2();
}

class Sample implements I1,I2{

    public void show() {
        System.out.println("Sample class");
    }

    @Override
    public void show2() {
        // TODO Auto-generated method stub
        // super();
        System.out.println("Interface I2");
    }

    @Override
    public void show1() {
        // TODO Auto-generated method stub
        System.out.println("Interface I1");
    }

    @Override
    public void show3() {
        // TODO Auto-generated method stub
        System.out.println("Interface IG");
    }
}

public class ex3 {

    public static void main(String[] args) {
        Sample s = new Sample();
        s.show();
        s.show1();
        s.show2();
        s.show3();
    }
}
