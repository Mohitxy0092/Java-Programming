interface parent{
  void meth1();
  void meth2();
}
class child implements parent {
  public void meth1(){
    System.out.println("Hello");
  }
  public void meth2(){
    System.out.println("hello2");
  }
  
  public void meth3() {
    System.out.println("hello3");
  }
}

public class basic{
  public static void main(String args[]){
    parent p1=new child();
    p1.meth1();
    p1.meth2();
    child c1=new child();
    c1.meth3();

  }
}