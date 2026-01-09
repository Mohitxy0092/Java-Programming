public class RunnableClass2 implements Runnable{
    public void run() {
        int i=1;
        while(i<10) {
            System.out.println(i+" Hello ");
            i++;
        }
    }

    public static void main(String[] args){
        RunnableClass2 r=new RunnableClass2();
        Thread t=new Thread(r);
        t.start();
            int i=1;
            while(i<10) {
                System.out.println(i+" World ");
                i++;
            }
    }
}