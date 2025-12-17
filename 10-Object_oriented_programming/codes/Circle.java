class Circle1{
  public float radius;

  void Area(){
    System.out.println(Math.PI*(Math.pow(radius, 2)));
  }
  void perimeter(){
    System.out.println(2*Math.PI*radius);
  }
};

public class Circle{
  public static void main(String[] args) {
    Circle1 c=new Circle1();
    Circle1 c2=new Circle1();
    c.radius=5;
    c2.radius=2;
    c.Area();
    c.perimeter();
    c2.Area();
    c2.perimeter();
  }
}
