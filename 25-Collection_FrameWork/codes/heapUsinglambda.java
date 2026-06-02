import java.util.PriorityQueue;

public class heapUsinglambda {
    public static void main(String[] args) {
        PriorityQueue<Integer>min_heap=new PriorityQueue<>((o1,o2)->Integer.compare(o1,o2));
        PriorityQueue<Integer>max_heap= new PriorityQueue<>((o1,o2)-> Integer.compare(o2,o1));
        
    }
}
