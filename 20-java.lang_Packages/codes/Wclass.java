public class Wclass {
  public static void main(String[] args) {
    // Conversion from primitive to wrapper class
    int i=10;
    Integer it=Integer.valueOf(i);
    /*
    After conversion we can use different methods of wrapper class with it's object.
     In above example we can call methods of Integer class with object it.
     */ 
     //OR
    Integer itr=new Integer(i); //deprecated
    
    char x= 'c';
    Character ch=Character.valueOf(x);
    //OR
    Character chr=new Character(x);//deprecated

    float f=12.123f;
    Float fr=Float.valueOf(f);
    Float frd=new Float(f);//deprected

    byte b=12;
    Byte br=Byte.valueOf(b);
    Byte bre=new Byte(b);// deprected

   double d=122.2;
   Double dr=Double.valueOf(d);
   Double dr1=new Double(d);//deprected

   System.out.println(it);

  //Conversion from wrapper class to primitive
     /*
       Integer in = new Integer(100);
       // Converting into primitive type
       int i = in.intValue();
       // OR
       int i = in;
       
       Double db = new Double(10.5);
       double d = db.doubleValue();
       // OR
       double d = db;
       AutoBoxing
       int i = 100;
       double d = 10.5;
       // Following are autoboxing
       Integer in = i;
       Integer ig = 20;
       Double db = d;
       Double dl = 20.5;
       // Following is not autoboxing
       // Integer in = new Integer(i);
       
       ----------------------------------------
       AutoUnBoxing
       Integer in = new Integer(100);
       Double db = new Double(20.5);
       // Following are unboxing
       int i= in;
       double d = db;
       int j = new Integer(50);
       double k = new Double(50.5);
       // Following is not unboxing
       // int i = in.intValue();
       
       
      */

     Integer intv=Integer.valueOf(100);
     int gg=100;
     System.out.println(Integer.reverse(gg));
  }
}
