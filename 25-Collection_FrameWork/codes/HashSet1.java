import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer>ht=new HashSet<>();
        HashSet<Integer>ht1=new HashSet<Integer>(20,0.75f);
        ht.add(10);
        ht.add(20);
        ht.add(20);
        ht.add(299);
        System.out.println(ht);
    }
}