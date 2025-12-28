class HondaCity{
  public static double price=100000.0;
  static double OnRoadPrice(String city){
    switch(city){
      case "Delhi":
        return price+price*0.1;
      case "Uttarakhand" :
        return price + price * 0.9;

      default : return price;
      }
  }
}

public class Demo{
  public static void main(String args[]){
    System.out.println(HondaCity.price);
    System.out.println(HondaCity.OnRoadPrice("Delhi"));
    System.out.println(HondaCity.OnRoadPrice("Mumbai"));
  }
}