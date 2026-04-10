import java.util.*;
public class arrayDemo{
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>(20);
        ArrayList<Integer>a2=new ArrayList<>(List.of(10,203,3403,494));
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.addAll(a2);
        a.addAll(5, a2);
        a.add(10, 1000);
        a.set(0,69);
        
        // System.out.println(a);
        // System.out.println(a.contains(5));
        // for(int i=0;i<a.size();++i) {
        //     System.out.println(a.get(i));
        // }
        // System.out.println("For Each");
        // for(Integer x : a) {
        //     System.out.println(x);
        // }
        a.forEach((x)->{
            System.out.println(x);
        });
        Iterator<Integer> it =a.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}