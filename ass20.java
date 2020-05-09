
// https://itnext.io/how-to-synchronize-multiple-threads-in-java-demystified-3c4419b0364a ==> studied from here
import java.lang.Thread;

// import jdk.internal.jshell.tool.resources.version;

class EvenThread extends Thread {
    static int x = 2;

    public void run() {
        System.out.print(x + " ");
        x += 2;
    }
}

class OddThread extends Thread {
    static int x = 1;

    public void run() {
        System.out.print(x + " ");
        x += 2;
    }
}

class ass20 {
    public static void main(String args[]) {
        OddThread odt = new OddThread();
        EvenThread evt = new EvenThread();
        odt.setPriority(Thread.MAX_PRIORITY);
        evt.setPriority(Thread.NORM_PRIORITY);
        for (int i = 0; i < 4; i++) {
            odt.start();
            evt.start();
        }
        // odt.start();
        // evt.start();
    }
}
