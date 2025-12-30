public class Demo{
  public void func1(){
    System.out.println(1/0);
  }
  public void func2(){
    func1();
  }
  public void func3(){
    func2();
  }
  public static void main(String[] args) {
    /*
    int a,b,c;
    try{
      a=10;
      b=0;
      c=10;
      System.out.println("Division of a/b : "+a/b);
      System.out.println("Division of a/c : "+a/c);
    }catch(ArithmeticException e){
      System.out.println("Division by zero..");
    }
    */
   
    /*
    try{
      int[] ar={10,0,1,4,5};
      
      try{
        int r=ar[0]/ar[1];
        System.out.println("division: "+r);
      }catch(ArithmeticException e){
        System.out.println("Division by zero... : "+e);
      }
      System.out.println("Element at index: "+ar[10]);
    }catch(ArrayIndexOutOfBoundsException er){
      System.out.println("\nIndex out of Bound...\n"+er);
    }
    */
   Demo d=new Demo();
    d.func3();
  }
}