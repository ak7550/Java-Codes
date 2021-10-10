// package 'Thread code practise';
class Counter{
    int count;
    public synchronized void  incr() {
      count++;
      // System.out.print(count+" ");
    }
  }
  class ThreadS {
    public static void main(String[] args)throws InterruptedException {
  
      Counter c = new Counter();
      Thread t1 = new Thread(new Runnable(){
        public void run(){
          for(int i=0; i<1000; i++)
            c.incr();
        }
      });
  
      Thread t2 = new Thread(new Runnable(){
        public void run(){
          for(int i=0; i<1000; i++)
            c.incr();
        }
      });
  
      t1.start();
      t2.start();
      System.out.println("Count = " + c.count);
      // t1.join();
      //t1 is completed, t2 might not, so c.count might be 2000 or 1000 or in between [1000,2000]
      System.out.println("Count = " + c.count);
      // t2.join();
      
      System.out.println("Count = " + c.count);
    }
  }
  