import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class bufferedStream {
    public static void main(String[] args) throws Exception{
        // FileInputStream fis=new FileInputStream("a.txt");
        // BufferedInputStream bis=new BufferedInputStream(fis);
        // int a;
        // while((a=bis.read()) != -1) {
        //     System.out.println((char)a);
        // }
        // System.out.println("");

        // System.out.println("File "+ fis.markSupported());
        // System.out.println("Buffered "+ bis.markSupported());

        //new Example
        FileReader fis = new FileReader("a.txt");
         BufferedReader bis=new BufferedReader(fis);
       
         System.out.println((char)bis.read());
         System.out.println((char)bis.read());
         System.out.println((char)bis.read());
         System.out.println((char)bis.read());
         System.out.println((char)bis.read());
         bis.mark(10);
         System.out.println((char)bis.read());
         System.out.println((char)bis.read());
         System.out.println((char)bis.read());
         System.out.println((char)bis.read());
         System.out.println((char)bis.read());
         bis.reset();
         System.out.println((char)bis.read());
         System.out.println((char)bis.read());
         System.out.println((char)bis.read());
        
        
        fis.close();
        bis.close();

    }
}
