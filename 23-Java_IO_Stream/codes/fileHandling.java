import java.io.File;
import java.io.FileOutputStream;

public class fileHandling {
 public static void main(String[] args) throws Exception{
    /*
    File f=new File("C:\\Users\\mohit\\Desktop");
    
    System.out.println(f.isDirectory());
    String list[]= f.list();
    for(String x : list) {
        System.out.println(x);
    }
    File x[]=f.listFiles();
    for(File g : x) {
        System.out.println(g.getName());
        System.out.println(g.getPath());
        System.out.println(g.getParent());
        System.out.println(g.getCanonicalPath());

    }
    */

    File f=new File("a.txt");
    f.setReadOnly();
    f.setWritable(true);
    f.setLastModified(10);
    FileOutputStream fos=new FileOutputStream("a.txt");
    fos.close();
 }   
}
