public class genericDemo {
 public static void main(String[]  args) {
    /*
    Example 1:
    Object obj = new String("Hello I am non Generic.");
    obj=new Integer(10); // deprecated
    obj = Integer.valueOf(10);
    String str=(String)obj;

    */
    
    
   Object obj[]=new Object[3];
   obj[0]="hello";
   obj[1]=10.9;
//    obj[2]=new Integer(10); // deprecated
   obj[2]=Integer.valueOf(10);

    String str;
    for(int i=0;i<3;++i) {
        str=(String)obj[i];
        System.out.println(str);
    }
 }   
}
