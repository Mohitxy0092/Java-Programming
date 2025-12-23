class outer{
  static int x=10;
  static class inner{
    public void show(){
      System.out.println(x);
    }
  }
}

public class staticClass {
  public static void main(String[] args) {
    outer.inner in=new outer.inner();
    in.show();
  }
}
