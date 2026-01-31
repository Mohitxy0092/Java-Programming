import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Student{
    String name;
    String branch;
    int rollno;
}

public class PrintDemo {
    public static void main(String[] args) throws Exception {
       /*
         FileOutputStream fos=new FileOutputStream("a.txt");
         PrintStream ps=new PrintStream(fos);
         Student s=new Student();
         s.name="Mohit";
         s.branch="CSE";
         s.rollno=11311;
         ps.println(s.name);
         ps.println(s.branch);
         ps.println(s.rollno);
         fos.close();
         ps.close();
        */
       FileInputStream fis=new FileInputStream("a.txt");
       BufferedReader br=new BufferedReader(new InputStreamReader(fis));
       Student s=new Student();
       s.name=br.readLine();
       s.branch=br.readLine();
       s.rollno=Integer.parseInt(br.readLine());
       System.out.println(s.name);
       fis.close();
       br.close();
    }
}
