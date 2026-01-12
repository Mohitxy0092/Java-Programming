/*
class Greeting{
  public void Display(){
    System.out.println("hello");
  }
  @Deprecated
  public void Show() {
    System.out.println("Hii");
  }
}
public class Ano {
 @SuppressWarnings("Deprication")
  public static void main(String[] args) {
      Greeting g=new Greeting();
      g.Show();
      g.Display();
  }
}
  */

/* 
abstract class Animal{
  abstract void DisplayName(String name);
}

class Dogs extends Animal{

    @Override
    public void DisplayName(String name){
      System.out.println(name);
    }
} 
    */

class Animal{
  public void DisplayName(){
    
  }
}
 class Dogs extends Animal{

   @Override
  public void DiplayName(){ // use correct name 
    System.out.println("Dog");
  }
 }

public class Ano{
  public static void main(String[] args) {
    Animal a=new Dog();
    a.DisplayName();
  }
}
