class Car {
  public void start(){
    System.out.println("Car is starting");
  }
  public void accelerate(){
    System.out.println("Car is accelerating");
  }
  public void changeGear(){
    System.out.println("Car is changing gear");
  }
  public void stop(){
    System.out.println("Car is stopping");
  }
}

class LuxaryCar extends Car{
  @Override
  public void changeGear(){
    System.out.println("Luxary Car is changing gear smoothly");
  }
  public void openSunroof(){
    System.out.println("Luxary Car sunroof is opening");
  }

}

public class OverRidingExample {
  public static void main(String args[]){
    Car c1=new Car();
    c1.start();
    c1.accelerate();
    c1.changeGear();
    c1.stop();

    LuxaryCar lc1=new LuxaryCar();
    lc1.start();
    lc1.accelerate();
    lc1.changeGear();
    lc1.openSunroof();
    lc1.stop();
  }
}
