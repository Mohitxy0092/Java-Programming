public class vargs {
  static void show(int ...A){
    for(int x : A){
      System.out.println("values : "+x);
    }
  }
  void printString(String ...s){
      
    for(int i=0;i<s.length;++i) {
      System.out.println("index : "+i + " name: "+ s[i]);
    }
  }
  
  void printString(int start,String... s) {

    for (int i = 0; i < s.length; ++i) {
      System.out.println("index : " + start + " name: " + s[i]);
      start++;
    }
  }
  public static void main(String args[]){
    show();
    show(12,13,14,15);
    show(new int[]{1,2,3,4,5});
    vargs s=new vargs();
    s.printString("John", "Mohn", "Don", "Swarn", "parteek");
    System.out.println("Calling function with starting point : ");
    s.printString(3,"John","Mohn","Don","Swarn","parteek");
  }
}
