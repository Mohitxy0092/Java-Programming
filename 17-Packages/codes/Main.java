import mypack1.Demo1;
import mypack1.inner.Demo2;
import mypack1.myMath.Add;
public class Main {
     public static void main(String[] var0) {
      Demo1 var1 = new Demo1();
      var1.display();
      Demo2 var2 = new Demo2();
      var2.display();
      Add var3 = new Add();
      System.out.println("Sum of two number is  : " + var3.addition(1, 2));
   }
}

