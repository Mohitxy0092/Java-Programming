import java.util.*;
import java.lang.*;
abstract class Shape{
  public void Display(){
    System.out.println("generic Shape is Method is called...");
  }
  abstract public void Area();
  abstract public void perimeter();
}
class Circle extends Shape{
  public double radius;
  public Circle(int r){
    this.radius=r;
  }
  @Override
  public void Area(){
    System.out.printf("%.2f\n",Math.PI * radius * radius);
  }
  
  @Override
  public void perimeter() {
    System.out.printf("%.2f\n",2 * Math.PI * radius);
  }

}
class Rectangle extends Shape{
  public double length,breadth;
  public Rectangle(int l,int b){
    this.breadth=b;
    this.length=l;
  }

  @Override
  public void Area(){
    System.out.printf("Area of rectangle is : %.2f\n",length*breadth);
  }

  @Override
  public void perimeter(){
    System.out.printf("Perimeter of rectangle is : %.2f\n",2*(length + breadth));
  }
}
public class Shapes {
  public static void main(String args[]){
    Shape c=new Circle(5);
    c.Area();
    c.perimeter();
    Shape r=new Rectangle(5, 2);
    r.Area();
    r.perimeter();


  }
}
