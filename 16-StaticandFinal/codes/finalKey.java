// for final variable

/*

public class finalKey {
  static final double pi=3.141516;
  public static void main(String args[]){
    final int x=10;
    System.out.println("Value of pi is : "+  finalKey.pi);
    System.out.println("Value of x : "+ x);
  }
}

*/

// for final method

/*
class Parent{
  final void meth1(){System.out.println("Hello from parent class..");}
}
class Child extends Parent{
  
  // meth1() cannot be override

  // void meth1(){
  //   System.out.println("Hello from Child class..");
  // }

  void meth2(){System.out.println("hello");}
}
public class finalKey{
  public static void main(String[] args) {
    Parent y=new Parent();
    y.meth1();
    Child x=new Child();
    x.meth2();
  }
}

*/

//for final class

/*

final class Parent{
  void meth1(){
    System.out.println("Hello");
  }
}
class Child extends Parent{

}

*/