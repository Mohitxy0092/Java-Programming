// interface my{
//   public void show();
// }
// class outer{
//   public void Display(){
//     new my(){
//       public void show(){
//         System.out.println("hello..");
//       }
//     }.show();
//   }
// }
// public class Anom {
//   public static void main(String[] args) {
//     outer o=new outer();
//     o.Display();
//   }  
// }

abstract class my {
  abstract public void show();
}

class outer {
  public void Display() {
    new my() {
      public void show() {
        System.out.println("hello..");
      }
    }.show();
  }
}

public class Anom {
  public static void main(String[] args) {
    outer o = new outer();
    o.Display();
  }
}
