class Overload{
  public int max(int a,int b){
    return Math.max(a, b);
  }
  public int max(int a,int b,int c){
    return Math.max(a,Math.max(b,c));
  }
  public double max(double x,double y){
    return Math.max(x,y);
  }
}

public class Overloading {
  public static void main(String args[]){
    Overload s1=new Overload();
    System.out.println(s1.max(1, 2));
    System.out.println(s1.max(1,1000,4));
    System.out.println(s1.max(1.0, 2.0));
  }  
}
