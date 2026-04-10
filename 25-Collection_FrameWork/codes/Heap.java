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
        PriorityQueue<Integer>pq =new PriorityQueue<>((a,b)->Integer.compare(a, b));// min heap
        PriorityQueue<Integer>pq =new PriorityQueue<>((a,b)->Integer.compare(b, a));// max heap

        pq.add(10);
        pq.add(100);
        pq.add(1);
        pq.add(101);
        // Scanner sc=new Scanner(System.in);
        // for(int i=0;i<3;++i) {
        //     pq.add(sc.nextInt());
        // }
        // sc.close();
        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
            
        }
    }
}