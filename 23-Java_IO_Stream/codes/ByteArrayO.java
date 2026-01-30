import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayO {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('x');
        bos.write('z');
        // byte b[]=bos.toByteArray();
        // for(byte x : b) {
        //     System.out.println(x);
        // }
        bos.writeTo(new FileOutputStream("a.txt"));
        bos.close();
        
    }
}
