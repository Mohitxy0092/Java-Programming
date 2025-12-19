class Circle {
  public double radius;

  public Circle() {
    radius = 0.0;
  }

  public double Area() {
    double area= Math.PI*radius*radius;
    System.out.println("Area of Circle is : " + area);
    return area;
  }

  public void Perimeter() {
    double perimeter = 2*Math.PI * radius;
    System.out.println("perimeter of Circle is : " + perimeter);
  }
}

class Cylinder extends Circle {
  public double height;

  public Cylinder() {
    height = 0.0;
  }

  public void Volume() {
    System.out.println("Volume is : "+ Area()*height);
  }
}

public class Example {
  public static void main(String args[]) {

    Cylinder c=new Cylinder();
    c.radius=5.0;
    c.height=5.0;
    c.Volume();
    c.Area();

  }
}
// just a raw example