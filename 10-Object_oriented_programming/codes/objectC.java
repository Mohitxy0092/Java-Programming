class Car {
  private int gear;

  void canHonk(boolean pressHonk) {
    // some Statements
    if(pressHonk){
      System.out.println("beeps");
    }
  }

  void ChangeGears(int x) {
    // some Statements
    gear=x;
    System.out.println("The car is on : "+ gear + " gear...");
  }
}
public class objectC{

  public static void main(String[] args) {
    Car suv=new Car();
    suv.canHonk(true);
    suv.ChangeGears(5);
  } 
}
// this is just a raw example there are many more things to add.
