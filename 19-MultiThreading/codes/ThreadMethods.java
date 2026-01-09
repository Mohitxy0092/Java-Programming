/*
 // using Runnable
class MyThread implements Runnable{
  public void run(){
    System.out.println("Ehh?");
  }
}
public class ThreadMethods{
  public static void main(String[] args) {
    Thread t=new Thread(new MyThread(),"My thread 1..");
    t.setPriority(1);
    System.out.println(t.getName() + " " + t.threadId() + " " + t.getState() + " " + t.getPriority());
  }
} 
*/

/* 
//extending thread
class myThread extends Thread{
  myThread(String name) {
    super(name);
    setPriority(myThread.MIN_PRIORITY+9);
  }
  public void run() {
    int cnt=1;
    while(cnt<=100) {
      System.out.println(cnt + "\n");
      try{
        Thread.sleep(100);
        cnt++;
      }catch(InterruptedException e) {
        System.out.println(e);
      }
    }
  }
}
public class ThreadMethods{
  public static void main(String[] args) {
    myThread t=new myThread("MyThread 1");
    t.start();
    t.interrupt();
    System.out.println(t.getState());
    System.out.println(t.isDaemon());
  }
}
*/

class MyThread implements Runnable {
  public void run() {
    int cnt=1;
    while(true) {
      System.out.println(cnt++);
    }
  }
}
public class ThreadMethods{
  public static void main(String[] args) throws InterruptedException {
    Thread t=new Thread(new MyThread());
      t.setDaemon(true);
      t.start();
      Thread.sleep(1);
      Thread mainThread=Thread.currentThread();
      mainThread.join();

  }
}
