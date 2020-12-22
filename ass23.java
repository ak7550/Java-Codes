import java.lang.Thread;

class EveThread extends Thread {
    int x = 2, sum = 0;

    public void run() {
        while (x <= 100) {
            sum += x;
            x += 2;
            System.out.println(x + " and the sum is: " + sum);
        }
    }
}

class OdThread extends Thread {
    int x = 1, sum = 0;

    public void run() {
        while (x < 100) {
            sum += x;
            x += 2;
            System.out.println(x);
        }
    }
}

class ass23 {
    public static void main(String args[]) {
        OdThread odt = new OdThread();
        EveThread evt = new EveThread();
        odt.start();
        evt.start();
        try {
            evt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Result is: " + (odt.sum + evt.sum));
    }
}