import java.lang.*;
class MyObject {

  @Override
  public boolean equals(Object o){
    return this.hashCode()==o.hashCode();

  }
  public String toString(){
    return "My Object";
  }
}
public class Demo {
  public static void main(String args[]) {
      // int a=10;
      // int b=20;
      // int c=20;
      // int d=a*2;
      // System.out.println((a==b));
      // System.out.println((c==d));
      // String s1=new String("Hello");
      // String s2=new String("Hello");
      // String s3=s1;
      // System.out.println(s1.equals(s2));
      // System.out.println(s1==s2);
      // System.out.println(s1==s3);
      // System.out.println(s1.equals(s3));
      // System.out.println(o1.equals(o2));
      Object o1=new Object();
      Object o2=o1;
      Object o3=new Object();
      System.out.println((o1==o2));
      System.out.println(o1==o2);
      System.out.println(o1==o3);
      
      System.out.println(o1.hashCode());
      String str1= "Hello";
      String str2="hello";
      String str3=str1;
      System.out.println(str1==str2);
      System.out.println(str1.equals(str2));
      System.out.println(str2.equals(str3));
      System.out.println(str2==str3);
    }
  }