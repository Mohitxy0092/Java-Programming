@FunctionalInterface
interface A{
  public void Display();
}

/*
Method 1 implementation
class B implements A{
  @Override
  public void Display() {
    System.out.println("Hello World..");
  }
}
  */
public class First {
  public static void main(String[] args) {
    // Method 1
    /*
        B b1=new B();
        b1.Display();
     */
    // Method 2
    /*
        A a1=new A(){
          public void Display() {
            System.out.println("Hello World...");
          }
        };
    */
    A a1= ()->{
      System.out.println("Hello");
    };
    a1.Display();
  }
}
