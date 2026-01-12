@FunctionalInterface
interface Arithmatic{
  public double operate(int a,int b);
}

public class Add{
  public static void main(String[] args) {
    Arithmatic add=(a,b)->{return a+b;};
    Arithmatic sub=(a,b)->{return a-b;};
    Arithmatic multi=(a,b)-> a*b;
    System.out.println(add.operate(12, 12));
    System.out.println(sub.operate(10, 20));
    System.out.println(multi.operate(20, 10));
  }
}