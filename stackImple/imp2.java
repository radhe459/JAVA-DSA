
package stackImple;

import java.util.*;

class Stackimp2{
    ArrayList<Integer> list=new ArrayList<Integer>();
    public void push(int n){
        list.add(n);
        System.out.println("Pushed : "+list.get(list.size()-1));
    }
    
    public int pop(){
        if(empty()){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        
        return list.remove(list.size()-1);
    }
    public int peek(){
        if(empty()){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return list.get(list.size()-1);
    }
    public int size(){
        return list.size();
    }
    public boolean empty(){
        return list.isEmpty();
    }
}

public class imp2 {
    public static void main(String[] args) {
        Stackimp2 ob=new Stackimp2();
        ob.push(5);
        ob.push(10);
        ob.push(55);
        ob.push(66);
        System.out.println("Popped : "+ob.pop());
        System.out.println("Popped : "+ob.peek());
        System.out.println("Size : "+ob.size());
        System.out.println("Empty : "+ob.empty());
    }
}
