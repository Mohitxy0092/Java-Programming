
class Outer{
 private int x=19;
  class inner{
  public void Display(){
    System.out.println("Inner method... : "+x);
  }
  } 
}
public class nestedClass{
  public static void main(String args[]){
    Outer outer=new Outer();
    Outer.inner in=outer.new inner();
    in.Display();
  }
}