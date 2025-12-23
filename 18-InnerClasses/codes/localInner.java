class outer {
  public void Display(){
    class inner{
      public void show(){
        System.out.println("show method called..");
      }
    }
    inner i=new inner();
    i.show();
  }
}

public class localInner {
  public static void main(String[] args) {
    outer o=new outer();
    o.Display();
  }  
}
