import java.lang.*;
import java.util.*;
class mycmp implements Comparator<Integer>{
    public int compare(Integer o1,Integer o2) {
        if(o1>o2) return -1;
        if(o1<o2) return 1;
        return 0;
    }
}
public class priority_queue_practiceComparator{
    public static void main(String[] args) {
        /*
        
        // min Heap;
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(20);
        pq.offer(30);
        pq.offer(40);
        pq.offer(40);
        pq.offer(50);
        pq.offer(60);
        pq.offer(70);
        pq.offer(80);
        System.out.println("peak 1: "+ pq.peek());
        pq.remove(); // remove top/head element 
        System.out.println("peak 2: "+pq.element());
        pq.remove();
        while(!pq.isEmpty()){
            System.out.println(pq.poll());

        }
        pq.poll(); // retrieve and remove top element
        
        */

        PriorityQueue<Integer>max_heap= new PriorityQueue<Integer>(new mycmp());
        max_heap.add(10);
        max_heap.add(20);
        max_heap.offer(30);
        max_heap.offer(40);
        max_heap.offer(40);
        max_heap.offer(50);
        max_heap.offer(60);

        System.out.println("peak 1: "+ max_heap.peek());
        max_heap.remove(); // remove top/head element
        System.out.println("peak 2: "+max_heap.element());
        max_heap.remove();
        while(!max_heap.isEmpty()){
            System.out.println(max_heap.poll());
        }
        
    }
}