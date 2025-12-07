public class formatSpecifier{
    public static void main(String args[]){
        // int a=5;
        // int b=20;
        // System.out.printf("Hello %n : %d and %d",a,b);
        String str= "Java Programming";
        System.out.println("string str : "+str);
        
        //string by constructor
        
        byte b[]={65,66,67,68};
        String byteStr= new String(b); //ABCD
        System.out.println("Byte String is : "+byteStr);

        char c[]={'a','b','c','d'};
        String charStr=new String(c);
        System.out.println("Char String is: "+charStr);
        
        String str2=new String("hello");
        System.out.println("String str2 : "+ str2);
    }
}