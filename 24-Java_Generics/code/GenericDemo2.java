public class GenericDemo2<T>
 {
    Object data[]= new Object[3];
    public static void main(String[] args)throws Exception{
       GenericDemo2<String> g=new GenericDemo2<>();
       g.data[0]="Eh ?";
       g.data[1]="Hey";
    //    g.data[2]=10;//error typecaste
    //    g.data[2]=Integer.valueOf(10);// error
        String s= (String) g.data[0];
        System.out.println(s);
    }
}
