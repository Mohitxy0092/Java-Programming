abstract class Abstract{
  public void method1(){
    System.out.println("method 1 of abs is called...");
  }
  abstract public void Animal();
}

class SubAbtract extends Abstract{
  @Override
  public void Animal(){
    System.out.println("Abstract method called...");
  }
}
public class Abst{
 public static void main(String args[]){
  Abstract obj=new SubAbtract();
  obj.Animal();
  obj.method1();
 } 
}