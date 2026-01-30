import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Copying {
  public static void main(String[] args) throws Exception{
    FileInputStream fs=new FileInputStream("a.txt");
    FileInputStream fs1=new FileInputStream("b.txt");
    FileOutputStream fo=new FileOutputStream("dest.txt");
    SequenceInputStream s=new SequenceInputStream(fs,fs1);
    int b;
    while((b=s.read()) != -1) {
      fo.write(b);
    }
    fs.close();
    fs1.close();
    fo.close();
    s.close();
  }  
}
