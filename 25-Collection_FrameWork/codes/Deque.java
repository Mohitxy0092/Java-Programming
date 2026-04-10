import java.util.*;
public class Deque{
    public static void main(String[] args){
        ArrayDeque<Integer>q=new ArrayDeque<>();
        q.add(10);
        // throws exceptions if capacity is full
        q.addFirst(1);
        q.addLast(100);
        // return true false
        q.offerFirst(1000);
        q.offerLast(498);
        //stack
        q.push(10002);
        q.pop();
    }
}