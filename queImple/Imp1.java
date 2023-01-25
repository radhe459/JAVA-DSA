
package queImple;

import java.util.*;

class Queue{
    int capacity;
    int front;
    int rear;
    int arr[];
    Queue(int size){
        capacity=size;
        front=-1;
        rear=-1;
        arr=new int[size];
    }
    boolean isempty(){
        if(rear==-1) System.out.println("Queue is Empty");
        return rear==-1;
    }
    boolean isfull(){
        if(rear==capacity-1) System.out.println("Queue is Empty");
        return rear==capacity-1;
    }
    void enqueue(int ele){
        if(isfull()){
            return;
        }
        if(front==-1)
            front=0;
        rear++;
        arr[rear]=ele;
    }
    int dequeue(){
        if(isempty())
            return Integer.MIN_VALUE;
        int ele=arr[front];
        front++;
        if(front>rear){
            front=-1;
            rear=-1;
        }
        return ele;
    }
    
    int front(){
        if(isempty())
            return Integer.MIN_VALUE;
        return arr[front];
    }
    int rear(){
        if(isempty())
            return Integer.MIN_VALUE;
        return arr[rear];
    }
    
}

public class Imp1 {
    public static void main(String[] args) {
        Queue queue=new Queue(5);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        System.out.println("front : "+queue.front());
        System.out.println("deleted : "+queue.dequeue());
        System.out.println("front : "+queue.front());
        System.out.println("rear : "+queue.rear());
        System.out.println("empty : "+queue.isempty());
        System.out.println("empty : "+queue.isfull());
        System.out.println("deleted : "+queue.dequeue());
        System.out.println("deleted : "+queue.dequeue());
        System.out.println("deleted : "+queue.dequeue());
        System.out.println("empty : "+queue.isempty());
    }
    
}
