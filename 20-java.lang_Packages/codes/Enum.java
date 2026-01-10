/*
enum dept{
  CSE,IT,CIVIL,MECHANICAL,AEROSPACE;
  private dept() {
    System.out.println(this.name());
  }
  public void display() {
    System.out.println(this.name() + " " + this.ordinal());
  }
}
public class Enum {
  public static void main(String[] args) {
    // dept d=dept.CIVIL;
    // System.out.println(d);
    // System.out.println(d.ordinal());
    //  dept list[]=dept.values();
    //  for(dept x: list) {
    //   System.out.println(x);
    //  }

    dept d=dept.CSE;
    d.display(); //CSE 0
  }
} 
  */

enum dept{
  CSE("Mohit","Block A"),CIVIL("Rohit","Block B"),MECHANICAL("Suresh","Block E");
  String head;
  String location;
  private dept(String h,String b) {
    this.head=h;
    this.location=b;
  }
  public String getHeadName(){
    return this.head;
  }
  public String getBlock() {
    return this.location;
  }
}
public class Enum{
  public static void main(String[] args) {
    dept d=dept.CSE;
    System.out.println(d.getHeadName() + " " + d.getBlock());
  }
}
