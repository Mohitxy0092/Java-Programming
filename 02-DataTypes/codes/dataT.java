import java.lang.*;
class dataT{
    public static void main(String args[]){
        System.out.println("minimum value " + Integer.MIN_VALUE);
        System.out.print("maximum value " + Integer.MAX_VALUE);
        System.out.println("\n max bytes " + Byte.MAX_VALUE);
        System.out.println("\n min bytes " + Byte.MIN_VALUE);
        System.out.println("\n min float " + Float.MIN_VALUE);
        System.out.println("\n max float " + Float.MAX_VALUE);
        int var=10;//positive number
        System.out.println("\n"+Integer.toBinaryString(var));//to get binary bits of a number
        System.out.println("\n"+Integer.toHexString(var));//to get hexadecimal bits of a number
        System.out.println("\n"+Integer.toOctalString(var));//to get octal bits of a number
        //But what about negative numbers lets see
        int var1= -5;
        float x=10.5f;
        double y=10.6;
        boolean b=true;
        System.out.println("Float value: "+x);
        System.out.println("Double value: "+y);
        System.out.println("Boolean value: "+b);
         System.out.println("\n"+Integer.toBinaryString(var1));
         System.out.println("\n"+Integer.toHexString(var1));
         System.out.println("\n"+Integer.toOctalString(var1));
    }
}