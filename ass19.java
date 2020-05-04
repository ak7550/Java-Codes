import java.lang.Thread;

// When a Java program starts up, one thread begins running immediately. This is usually called the main thread of our program, because it is the one that is executed when our program begins.
// Java program to control the Main Thread 
class ChildThread extends Thread {
    public void run() {
        System.out.println("In Child Thread");
    }
}

public class ass19 {
    public static void main(String[] args) {
        ChildThread ct = new ChildThread();
        System.out.println("Name of the new thread is: "+ct.getName());
        Thread th = Thread.currentThread();
        System.out.println("In main thread");
        System.out.println("Name of the new thread is: "+th.getName());
        ct.start();
        // th.start(); // does not make sense to start the thread which is already been started
    }
}