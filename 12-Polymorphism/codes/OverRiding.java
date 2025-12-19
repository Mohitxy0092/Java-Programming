class Super{
  public void Display1(){
    System.out.println("Display1 is called...");
  }
}
class SubClass extends Super{

  @Override
  public void Display1(){
    System.out.println("Display1 of subClass is Called....");
  }
}

public class OverRiding {
  public static void main(String args[]){
      Super s1=new SubClass();
      s1.Display1();
      Super s2=new Super();
      s2.Display1();
      
  }  
}
