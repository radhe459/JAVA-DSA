
package queImple;

/**
 *
 * @author infor
 */

class Queue2{
    int front,rear,curr_size;
    int arr[],capacity;
    public Queue2(int cap){
        capacity=cap;
        front=0;
        rear=capacity-1;
        curr_size=0;
        arr=new int[capacity];
    }
    boolean isfull(){
        if(curr_size==capacity)
            System.out.println("Overflow");
        return curr_size==capacity;
    }
    
    boolean isempty(){
        if(curr_size==0)
            System.out.println("underflow");
        return curr_size==0;
    }
    
    void enqueue(int ele){
        if(isfull())
            return;
        rear=(rear+1)%capacity;
        arr[rear]=ele;
        curr_size+=1;
    }
    int dequeue(){
        if(isempty())
            return Integer.MIN_VALUE;
        int elem=arr[front];
        front=(front+1)%capacity;
        curr_size-=1;
        return elem;
    }
    int front(){
        if(isempty())
            return Integer.MIN_VALUE;
        //System.out.println(front);
        return arr[front];
    }
    int rear(){
        if(isfull())
            return Integer.MIN_VALUE;
        return arr[rear];
    }
}

public class imp2 {
    public static void main(String[] args) {
        Queue2 queue=new Queue2(5);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(15);
        System.out.println("full : "+queue.isfull());
        System.out.println("front : "+queue.front());
        System.out.println("deleted : "+queue.dequeue());
        System.out.println("front : "+queue.front());
        System.out.println("rear : "+queue.rear());
        System.out.println("empty : "+queue.isempty());
        System.out.println("full : "+queue.isfull());
        System.out.println("deleted : "+queue.dequeue());
        System.out.println("deleted : "+queue.dequeue());
        System.out.println("deleted : "+queue.dequeue());
        System.out.println("empty : "+queue.isempty());
    }
}
