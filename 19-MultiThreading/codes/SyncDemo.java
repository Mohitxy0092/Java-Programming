class Mydata {
  synchronized public void Display(String s) {
//  synchronized (this){
    for (int i = 0; i < s.length(); ++i) {
      System.out.print(s.charAt(i));
    }
//  }
    try{
      Thread.sleep(1000);
    }catch(InterruptedException e) {
      System.out.println(e);
    }
  }
}

class Thread1 extends Thread{
  Mydata d;
  public Thread1(Mydata d){
    this.d=d;
  }
  public void run() {
    d.Display("Thread 1 ");
  }
}

class Thread2 extends Thread{
  Mydata d;
  public Thread2(Mydata d) {
    this.d=d;
  }
  public void run() {
    d.Display("Hello ");
  }

}
class Thread3 extends Thread{
  Mydata d;
  public Thread3(Mydata d) {
    this.d=d;
  }
  public void run() {
    d.Display("Bye ");
  }
}

public class SyncDemo{
  public static void main(String[] args) {
    Mydata d=new Mydata();
    Thread1 t1=new Thread1(d);
    Thread2 t2=new Thread2(d);
    Thread3 t3=new Thread3(d);
    t1.start();
    t2.start();
    t3.start();
  }
}