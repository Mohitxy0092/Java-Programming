import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Student {
  public static void main(String[] args) throws Exception {
    FileInputStream fs=new FileInputStream("a.txt");
    FileOutputStream fo=new FileOutputStream("b.txt");
    int b;
    while((b=fs.read()) != -1) {
      if((b>=65) &&(b<=90)){
        fo.write(b+32);
      }else {
        fo.write(b);
      }
    }
    fs.close();
    fo.close();
  }   
}
