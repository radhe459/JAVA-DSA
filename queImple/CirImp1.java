
package queImple;

/**
 *
 * @author infor
 */

class CirQueue{
    int front,rear,capacity;
    int arr[];
    public CirQueue(int cap){
        front=-1;
        rear=-1;
        capacity=cap;
        arr=new int[capacity];
    }
    
    boolean isFull(){
        return (front==0 && rear==capacity-1) || (front==rear+1);
    }
    
    boolean isEmpty(){
        return (front==-1);
    }
    void enqueue(int ele){
        if(isFull()){
            System.out.println("Queue Overflow");
            return;
        }
        if(front==-1)
            front=0;
        rear=(rear+1)%capacity;
        arr[rear]=ele;
    }
    int dequeue(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        int elem=arr[front];
        if(rear==front){
            rear=-1;
            front=-1;
        }
        else{
            front=(front+1)%capacity;
        }
        return elem;
    }
    int front(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        return arr[front];
    }
    int rear(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        return arr[rear];
    }
}

public class CirImp1 {
    public static void main(String[] args) {
        CirQueue queue=new CirQueue(5);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(15);
        queue.enqueue(20);
        System.out.println("full : "+queue.isFull());
        System.out.println("front : "+queue.front());
        System.out.println("deleted : "+queue.dequeue());
        queue.enqueue(25);
        System.out.println("front : "+queue.front());
        System.out.println("rear : "+queue.rear());
        System.out.println("empty : "+queue.isEmpty());
        System.out.println("full : "+queue.isFull());
        System.out.println("deleted : "+queue.dequeue());
        System.out.println("deleted : "+queue.dequeue());
        System.out.println("deleted : "+queue.dequeue());
        System.out.println("empty : "+queue.isEmpty());
    }
}
