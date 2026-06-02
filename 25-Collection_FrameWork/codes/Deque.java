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
        ArrayDeque<String>queue=new ArrayDeque<String>();
        queue.offerLast("H");
        queue.offerLast("e");
        queue.offerLast("l");
        queue.offerLast("l");
        queue.offerLast("o");
        while(!queue.isEmpty()){
            System.out.println(queue.pollFirst());
        }
        System.out.println();
        queue.forEach((e)-> {
            System.out.println(e);
        });
        ArrayDeque<String>stack=new ArrayDeque<>();
        stack.offerLast("W");
        stack.offerLast("o");
        stack.offerLast("r");
        stack.offerLast("l");
        stack.offerLast("d");
        while(!stack.isEmpty()){
            System.out.println(stack.pollLast());
        }
        System.out.println();
        stack.forEach((e)-> {
            System.out.println(e);
        });

    }
}