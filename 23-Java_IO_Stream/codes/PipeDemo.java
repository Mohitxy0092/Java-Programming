import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread {
    OutputStream os;
    public Producer(OutputStream o) {
        os=o;
    }
    public void run() {
        int count=1;
        while(true) {
            try {
                os.write(count);
                os.flush();
                System.out.println("Producer producing : " + count);
                System.out.flush();
                Thread.sleep(1000);
                count++;
            } catch (Exception e) {}
        } 
    }
}
class Consumer extends Thread{
    InputStream is;
    public Consumer(InputStream s) {
        is=s;
    }
    public void run() {
        int x;
        while(true) {
            try {
                x=is.read();
                System.out.println("Cosumer consuming : "+x);
                System.out.flush();
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }

        }
    }
}

public class PipeDemo {
    public static void main(String[] args) throws Exception{
        PipedOutputStream pos=new PipedOutputStream();
        PipedInputStream pis=new PipedInputStream();
        pis.connect(pos);
        Producer p=new Producer(pos);
        Consumer c=new Consumer(pis);
        p.start();
        c.start();
    }
}
