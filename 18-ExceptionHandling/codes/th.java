// class NegativeNumber extends Exception{
//   public String toString() {
//     return "Dimensions cannot be negative..";
//   }
// }
public class th{
  // static int meth3(int a,int b) throws NegativeNumber {
  //   if(a<0 || b<0 ) {
  //     throw new NegativeNumber();
  //   }
  //   return a*b;
  //   }
  // static void meth2() throws NegativeNumber {
  //   int a=2,b= -21;
  //   int c= meth3(a,b);
  //   System.out.println(c);
  // }
  public static void main(String arpgs[]) {
    // try {
    //    meth2();
    //  } catch (Exception e) {
    //   System.out.println(e);
    //  }

    try{
      System.out.println(10/0);
    }finally{
      System.out.println("hello");
    }
  }
}