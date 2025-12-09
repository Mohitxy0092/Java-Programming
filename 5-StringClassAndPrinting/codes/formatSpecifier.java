import java.lang.*;
import java.util.*;
import java.time.*;
public class formatSpecifier{
    public static void main(String args[]){
        // int a=5;
        // int b=20;
        // System.out.printf("Hello %n : %d and %d",a,b);
        // String str= "Java Programming";
        // System.out.println("string str : "+str);
        
        //string by constructor
        
        // byte b[]={65,66,67,68};
        // String byteStr= new String(b); //ABCD
        // System.out.println("Byte String is : "+byteStr);

        // char c[]={'a','b','c','d'};
        // String charStr=new String(c);
        // System.out.println("Char String is: "+charStr);
        
        // String str2=new String("hello");
        // System.out.println("String str2 : "+ str2);

        /* Method of String */


        // String str;
        // Scanner s=new Scanner(System.in);
        // str=s.nextLine();
        // s.close();
        // int n=str.length();
        // System.out.println("length is : "+n);
        // System.out.println("String is : "+str);
        // str=str.toLowerCase();
        // System.out.println("lowercase string :"+str);
        // str=str.toUpperCase();
        // System.out.println("Uppercase string :"+str);
        // String str2="    hello Mohit!    ";
        // System.out.println("string after trimming is : "+str2);
        // str2=str2.trim();
        // System.out.println("string after trimming is : "+str2);
        
        // System.out.println("strs' substring is: "+str.substring(2));
        // System.out.println("str substring within length is : "+str.substring(2,5));

        // System.out.println("replacing letter: "+str.replace('A', 'x'));

        // if(str.startsWith("https")){
        //     System.out.println("safe url");
        // }else {
        //     System.out.println("Not a safe url");
        // }

        // if(str.endsWith(".com") || str.endsWith(".io")){
        //     System.out.println("good domain");
        // }

        // System.out.println("string index "+str.indexOf("a"));
        // System.out.println("string index "+str.indexOf("ab"));
        // System.out.println("giving invalid index: "+str.indexOf("x"));// -1

        // System.out.println("lastIndexOf substring: "+str.lastIndexOf("x"));//10
        // System.out.println("lastIndexOf substring: "+str.lastIndexOf("x",9));//2
        // System.out.println("lastIndexOf substring: "+str.lastIndexOf("y",9));// -1

        // String str1="java";
        // String str2="JAVA";
        // String str3="cpp";
        // String str4="python";
        // System.out.println(str1.equals(str2));//false
        // System.out.println(str1.equals(str3));//false
        // System.out.println(str1.equalsIgnoreCase(str2));//true
        // System.out.println(str1.equalsIgnoreCase(str3));//false
        // System.out.println(str1.compareTo(str3));//106-99 =7
        // System.out.println(str3.compareTo(str4));//99-112= -13
        // System.out.println(str1.compareTo(str2));// 106 − 74= 32

        // String str3=new String("java");
        // String str4=" Python";
        // System.out.println(str1.equals(str3));
        // System.out.println(str1==str3);
        // System.out.println(str1.concat(str4));


        /*
            "." 
        String s="8ab";
        String str="a";
        System.out.println(s.matches("."));//false
        System.out.println(str.matches("."));//true
        
        */
        
       /* 
        [a-z0-9]
       String s="a";
       String str="%";
       System.out.println(str.matches("[a-z0-9]"));//false
       System.out.println(s.matches("[a-z0-9]"));//true
                
       */

       /*
       
       String s="d1";
       String str="b";
       System.out.println(s.matches("[a-c]"));    
       System.out.println(s.matches("[a-d][1-9]"));
       System.out.println(str.matches("a|b"));
       
       */
        /*
        
        String s="a";
        String str=" ";
        System.out.println(s.matches("\\d"));
        System.out.println(s.matches("\\D"));
        System.out.println(s.matches("\\w"));
        System.out.println(s.matches("\\W"));
        System.out.println(str.matches("\\s"));
        System.out.println(str.matches("\\S"));
        
        */
    /*
    Scanner sc=new Scanner(System.in);
    String p_num=sc.next();
    sc.close();

    if((p_num.matches("[+][0-9]+"))){
        System.out.println("this is a valid number");
    }else{
        System.out.println("This is not a valid number");
    }
    String mail_id="mohit121@gmail.com";
    int idx=mail_id.indexOf('@');
    System.out.println(mail_id.substring(0,idx));
    System.out.println(mail_id.substring(idx+1, mail_id.length()));
    System.out.println(mail_id.substring(idx + 1, mail_id.length()).startsWith("gmail"));

    */
    //regex excercise
    long a=1010101021;
    String s=String.valueOf(a);
    System.out.println(s.matches("[01]+"));
    String hexDec="AB1221";
    System.out.println(hexDec.matches("[A-F0-9]+"));
    
        String curr="12/04/2025";
    System.out.println(curr.matches("[0-3][0-9]/[01][0-9]/[0-9]{2,4}"));
    System.out.println(curr);

    String regex="a2334ksdfz@#$A@34#^sjkjAAKCHFRI#$234998&*";
    System.out.println(regex.replaceAll("[^[a-z][A-Z][0-9]]",""));

    String regex2=" Hello 123 @ Programmers!";
    System.out.println(regex2.replaceAll("[^[a-z][A-Z][0-9][!@#$%^&*]]",""));

    System.out.println(regex2.replaceAll("\\s+", "").trim());



    }
}