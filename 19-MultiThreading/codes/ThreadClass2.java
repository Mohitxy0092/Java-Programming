class ThreadClass2 extends Thread{
    public void run() {
        int i=1;
        while(i<10) {
            System.out.println(i+" Hello ");
            i++;
        }
    }
    public static void main(String args[]) {
        ThreadClass2 t=new ThreadClass2();
        t.start();
        int i=1;
        while(i<10) {
            System.out.println(i+" World ");
            i++;
        }
    }

}