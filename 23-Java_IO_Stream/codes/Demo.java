/*
import java.io.*;
public class Demo {
  public static void main(String[] args) {
    try {
      FileOutputStream fs=new FileOutputStream("C:\\Users\\mohit\\Desktop\\Java_Programming/statics/test.txt");
      String str="This is Java programming..";
      try {
        fs.write(str.getBytes());
        fs.close();
      } catch (Exception e) {
        System.err.println(e);
      }
     
      
    } catch (FileNotFoundException e) {
      System.err.println(e);
    }
  }
} 
*/

/*

import java.io.*;

public class Demo {
  public static void main(String[] args) throws Exception {
    
  try (
    FileOutputStream fos = new FileOutputStream("C:\\Users\\mohit\\Desktop\\Java_Programming\\statics\\test.txt")) {
      String str=new String("Here we go again..");
      // fos.write(str.getBytes());
      byte[] b= str.getBytes();
      // for(byte x : b) {
        //   fos.write(x);
        // }
        fos.write(b,6,str.length()-6);
        fos.close();
        System.out.println("Written in file completely..");
      }
    }
  }
  */

import java.io.*;
public class Demo {
  public static void main(String[] args) throws Exception {
    try(FileInputStream fis=new FileInputStream("C:\\Users\\mohit\\Desktop\\Java_Programming\\statics\\test.txt")) {
      // byte[] b=new byte[fis.available()];
      // fis.read(b);
      // String str=new String(b);
      // System.out.println(str);
      int x;
      // do{
      //   x=fis.read();
      //   System.out.print((char)x);
      // }while(x!= -1);

      while((x=fis.read()) != -1) {
        System.out.println((char)x);
      }

    }

  } 
}