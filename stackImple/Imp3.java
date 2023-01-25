
package stackImple;

import java.util.*;

public class Imp3 {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack=new ArrayDeque<Integer>();
        stack.push(15);
        stack.push(20);
        stack.push(10);
        stack.push(30);
        for(Integer i:stack){
            System.out.println("element :"+i);
        }
        System.out.println("stack size : " +stack.size());
        System.out.println("Popped Element : " +stack.pop());
        System.out.println("top Element : " +stack.peek());
        System.out.println("Popped Element : " +stack.pop());
        System.out.println("Empty : " +stack.isEmpty());
        System.out.println("Popped Element : " +stack.pop());
        System.out.println("Popped Element : " +stack.pop());
        System.out.println("Empty : " +stack.isEmpty());
        
    }
}
