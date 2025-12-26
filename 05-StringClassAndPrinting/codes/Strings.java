import java.lang.*;
public class Strings {
  // public void StringOperations(){

  // }

  public static void StringOperations(){
    String s="Hello Everyone!";
      StringBuilder str1=new StringBuilder("Hello Java");
      StringBuffer str2=new StringBuffer("Hello Sir!");
      System.out.println("String build using String Class : " + s);
      System.out.println("String build using StringBuilder class : "+str1);
      System.out.println("String build using StringBuffer class : "+str2);
      
      // converting s to another
      StringBuilder sbld=new StringBuilder(s);
      StringBuffer sbuff=new StringBuffer(s);
      
      // sbuff and sbuilder to String
      String str=str1.toString();
      String str3=str2.toString();

      sbld= sbld.append(" HI");
      sbuff=sbuff.append(" Hello");

      StringBuilder sb = new StringBuilder("Hello");
      StringBuffer buf = new StringBuffer(" Java");

      String result = sb.append(buf).toString();
      // String res="hello".append("hii").toString();//wrong we cant do this
  } 
  public static void main(String args[]){
    // Strings obj=new Strings();
    // obj.StringOperations(); //one way
    StringOperations();
  }
}
