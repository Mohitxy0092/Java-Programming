import java.util.*;
public class method{
  // static boolean func(int a,int b) {
  //   return a==b;
  // }

  boolean func(int a, int b) {
    return a == b;
  }
  
  static void increment(int a) {
    a++;
    System.out.println("Inside the increment Function : "+a);
  }
  static void changeNum(int ar[]){
    ar[0]=420;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    sc.close();
    System.out.println("before calling increment :"+a);
    increment(a);
    System.out.println("After calling increment :"+a);
    
    // int b=sc.nextInt();
    // boolean c=func(a,b);
    // System.out.println(c);
    // method mp=new method();
    // System.out.println(mp.func(a, b));
    // int ar[]={1,2,3,4,5};
    // System.out.println(ar[0]);
    // changeNum(ar);
    // System.out.println(ar[0]);
  }
}