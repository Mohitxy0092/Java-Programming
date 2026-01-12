interface MyLambda{
  public void Display(String s);
}

public class Practice2 {
//  public static void reverse(String s){
//   StringBuffer sb=new StringBuffer(s);
//   sb.reverse();
//   System.out.println(sb);
//  } 
public void reverse(String s) {
  StringBuffer sb=new StringBuffer(s);
  sb.reverse();
  System.out.println(sb);
}
 public static void main(String[] args){
  // MyLambda mb=Practice2 :: reverse; // for static member
  Practice2 mb=new Practice2();
  MyLambda ml=mb::reverse;
  ml.Display("hello");

 } 
}
