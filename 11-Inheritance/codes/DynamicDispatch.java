class Super{

  public void method1(){ System.out.println("Method 1 is called...");}
  
  public void method2() { System.out.println("Method 2 is calling..."); }
}
class SubClass extends Super{
  
  @Override
  public void method2(){ System.out.println("Method 2 SubClass is calling...");}
  
  public void method3() { System.out.println("Method 3 is calling..."); }

}

public class DynamicDispatch{
  public static void main(String args[]){
      Super s=new SubClass();
      s.method1();
      s.method2();
      // s.method3(); we can only call methods which are in super class 

      Super s1=new Super();
      s1.method2();

      SubClass s2=new SubClass();
      s2.method3();
    }
}