
package queImple;

import java.util.*;

public class Imp3 {
    public static void main(String[] args) {
        //Queue q= new LinkedList<Integer>();
        //Queue q= new LinkedList<>();
        //LinkedList<Integer> q=new LinkedList<>();
        //Queue q=new ArrayDeque<>();
        ArrayDeque q=new ArrayDeque<>();
        //Any of the above mentioned way can be used to implement queues using java collection
        
        q.offer(14);
        q.offer(20);
        q.offer(16);
        q.offer(18);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.contains(14));
        System.out.println(q.contains(20));
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        
    }
}
