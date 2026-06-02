import java.util.*;
import java.util.Map.Entry;
public class treeMap {
    public static void main(String []args) {
        TreeMap<Integer,String> tm=new TreeMap<>(Map.of(1, "a",
        2, "b",
        3, "c"));
        System.out.println(tm);
        tm.put(1,"x");
        System.out.println(tm.get(2));
        System.out.println(tm);
        Entry<Integer,String>et= tm.firstEntry();
        System.out.println(et.getKey() + "->>>" + et.getValue());
        HashMap<Integer,String> mp=new HashMap<>();
        mp.put(1, "a");
        mp.put(2,"b");
        mp.put(3,"b");
        

    }
}