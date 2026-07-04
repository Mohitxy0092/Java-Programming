//we are importing all created package in this main file
import mypack1.Demo1;
import mypack1.myMath.Add;
import mypack1.inner.Demo2;
public class Main{
  public static void main(String[] args) {
    Demo1 d1=new Demo1();
    d1.display();
    Demo2 d2=new Demo2();
    d2.display();
    Add a1=new Add();
    System.out.println("Sum of two number is  : "+a1.addition(1,2));
  }
}

