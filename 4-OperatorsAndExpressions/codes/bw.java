import java.lang.*;
import java.util.*;
public class bw{
    public static void main(String args[]){
        int a=9,b=12;
        int c;
        c=(a<<4);
        c=(c|b);
        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111));

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.printf("a:%d and b: %d",a,b);
    }
}