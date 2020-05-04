package practise;

// Java program to illustrate 
// how to get and change the 
// name of a thread. 
import java.io.*; 

// we can create thread by creating the 
// objects of that class. 
class ThreadNaming extends Thread 
{ 
	static int x=0;
	@Override
	public void run() 
	{ 
        System.out.println("Thread is running....."); 
        for (int i = 0; i < 100; i++) {
            System.out.print(i*2+" ");
        }
        System.out.println("");
		this.setName("ak"+x++); // we are trying to change the properties of the thread when they are being processed, raised an Uncaughtthread Exception Error.// checked error must handle
        System.out.println("The name is: "+this.getName());
	} 
} 

class GFG 
{ 
	public static void main (String[] args) 
	{ 
		// creating two threads 
		ThreadNaming t1 = new ThreadNaming(); 
		ThreadNaming t2 = new ThreadNaming(); 
		
		// getting the above created threads names. 
		System.out.println("Thread 1: " + t1.getName()); 
		System.out.println("Thread 2: " + t2.getName()); 
		
		t1.start(); 
		t2.start(); 
		
		// Now changing the name of threads. 
		t1.setName("geeksforgeeks"); // we are trying to change the properties of the thread when they are being processed, raised an Uncaughtthread Exception Error.// checked error must handle
		t2.setName("geeksquiz"); 
		
		// again getting the new names 
		// of the threads. 
		System.out.println("Thread names after changing the "+ 
		"thread names"); 
		System.out.println("New Thread 1 name: " + t1.getName()); 
		System.out.println("New Thread 2 name: " + t2.getName()); 
		
	} 
} 
