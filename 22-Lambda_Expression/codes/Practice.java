// @FunctionalInterface
// interface MyLambda{
//   public void display();
// }
// class Demo{
//   int temp=0;
//   public void meth1(){
//      int cnt=0;
//     MyLambda m=()->{
//       System.out.println("hello" + cnt);
//       System.out.println((++temp));
//     };
//     m.display();
    
//   }
// }
// public class Practice {
//   public static void main(String[] args) {
//     Demo d=new Demo();
//     d.meth1();
//   }
// }


// @FunctionalInterface
interface MyLambda{
  public void Display();
}
class UseLambda{
  public void meth1(MyLambda ml) {
    ml.Display();
  }
}
class demo{
  public void meth2(){
    UseLambda ul=new UseLambda();
    ul.meth1(()->{System.out.println("hello");});

  }
}
public class Practice{
  public static void main(String[] args) {
    demo d=new demo();
    d.meth2();
  }
}