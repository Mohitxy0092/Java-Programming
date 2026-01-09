class Mythread extends Thread{
    public void run() {
        int i=1;
        while(i<10) {
            System.out.println(i+" Hello ");
            i++;
        }
    }
}
public class ThreadClass1{
    public static void main(String args[]) {
        Mythread t=new Mythread();
        t.start();
        int i=1;
        while(i<10) {
            System.out.println(i+" World ");
            i++;
        }
    }
}