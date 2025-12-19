class A{
  public void Display() {
    System.out.println("printing Parent class..");
  }
}
class B extends A{

    @Override
    public void Display(){
      System.out.println("Printing Child Class...");
    }
}
public class method {
  public static void main(String arg[]){
      A a1=new A();
      a1.Display();
      B b1=new B();
      b1.Display();

  }
}
