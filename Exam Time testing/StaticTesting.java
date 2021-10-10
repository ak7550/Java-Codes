class SampleData {
    int data1;
    static int data2;

    {
        System.out.println("Gandu k liye initialization block");
    }

    static {
        data2 = 10;
        System.out.println("Static executed");
    }

    SampleData() {
        System.out.println("Sample constructor");
    }
}

public class StaticTesting {
    public static void main(String[] args) {
        SampleData s = new SampleData();
        SampleData s1 = new SampleData();
        System.out.println(s.data1);
    }
}
