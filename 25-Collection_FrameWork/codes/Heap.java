import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
// class cmp implements Comparator<Integer>{
//     public int compare(Integer o1,Integer o2){
//         if(o1<o2) return 1;
//         if(o1>o2) return -1;
//         else return 0;
//         }
// }
public class Heap{
    public static void main(String[] args) {
        // bydefault min-heap 
        // PriorityQueue<Integer> pq=new PriorityQueue<>(new cmp());
        PriorityQueue<Integer>min_heap =new PriorityQueue<>((a,b)->Integer.compare(a, b));// min heap
        PriorityQueue<Integer>max_heap =new PriorityQueue<>((a,b)->Integer.compare(b, a));// max heap

        min_heap.add(10);
        min_heap.add(100);
        min_heap.add(1);
        min_heap.add(101);
        while(!min_heap.isEmpty()) {
            System.out.println(min_heap.poll());
        }
    }
}