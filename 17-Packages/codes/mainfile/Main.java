import mypack1.demo1;
import mypack1.inner.demo2;
import mypack1.myMath.Add;
//we are importing all created package in this main file
public class Main{
  public static void main(String[] args) {
    demo1 d1=new demo1();
    d1.display();
    demo2 d2=new demo2();
    d2.display();
    Add a1=new Add();
    System.out.println("Sum of two number is  : "+a1.addition(1,2));
  }
}

