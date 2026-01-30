import java.io.ByteArrayInputStream;

public class ByteArray {
    public static void main(String[] args) throws Exception {
        // byte[] b={'a','b','c','d'};
        // ByteArrayInputStream bs=new ByteArrayInputStream(b);
        // int a;
        // while((a=bs.read()) != -1) {
        //     System.out.print((char)a+ " ");
        // }
        // bs.close();

        byte[] b= { 'a', 'b', 'c', 'd' };
        ByteArrayInputStream bs=new ByteArrayInputStream(b);
        
        String str=new String(bs.readAllBytes());
        System.out.println(str);
        System.out.println("\n"+bs.markSupported());
        
    }    
}
