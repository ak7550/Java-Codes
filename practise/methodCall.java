package practise;

public class methodCall {
    public static void main(String[] args) {
        int a = 1;
        print(a, ++a, a++);
        System.out.println("Value of a=" + a);
    }

    public static void print(int x, int y, int z) {
        System.out.println("x=" + x + " y=" + y + " z=" + z);
    }
}