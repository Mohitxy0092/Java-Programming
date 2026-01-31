import java.io.RandomAccessFile;

public class randomDemo{
    public static void main(String[] args) throws Exception {
        RandomAccessFile ras=new RandomAccessFile("a.txt", "rw");
        System.out.println((char)ras.read());
        System.out.println((char)ras.read());
        System.out.println((char)ras.read());
        System.out.println((char)ras.read());
        System.out.println((char)ras.read());
        System.out.println((char)ras.read());
        ras.write('N');
        System.out.println((char)ras.read());
        ras.skipBytes(3);
        System.out.println((char)ras.read());
        System.out.println((char)ras.read());
        ras.seek(6);
        System.out.println((char)ras.read());
        System.out.println(ras.getFilePointer());
        System.out.println((char)ras.read());
        ras.seek(ras.getFilePointer()+3);
        System.out.println((char)ras.read());

        ras.close();
    }
}