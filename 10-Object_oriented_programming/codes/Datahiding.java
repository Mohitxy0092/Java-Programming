class Circle{
  private float radius;

  /*
  1.get the value of radius
  2.set the value of radius
  3.calculate the area
  */
  public void radiusSetter(float r){
    radius=r;
  }
  public float radiusGetter(){
     return radius;
  }
  public void Area(){
      float area=(float)3.14*(radius*radius);
      System.out.println("The area of Circle is : "+ area);
    }
}

public class Datahiding {
  public static void main(String args[]){
    Circle c1=new Circle();
    c1.radiusSetter(5);
    System.out.println("Radius is : "+ c1.radiusGetter());
    c1.Area();

  }
}
