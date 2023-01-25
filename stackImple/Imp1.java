package stackImple;

import java.util.*;

class Stackimp1{
    int max;
    int top;
    int a[];
    public Stackimp1(int size){
        top=-1;
        max=size;
        a=new int[size];
    }
    
    public void push(int ele){
        if(isfull()){
            System.out.println("stack is full");
        }
        else{
            a[++top]=ele;
            System.out.println("pushed element is :"+ele);
        }
    }
    public int pop(){
        if(isempty()){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
       
        return a[top--];
        
    }
    public int peek(){
        if(isempty()){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return a[top];
    }
    public int size(){
        return top+1;
    }
    public boolean isfull(){
        if(top>=max-1)
            return true;
        return false;
    }
    
    public boolean isempty(){
        if(top==-1)
            return true;
        return false;
    }
}
public class Imp1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of stack : ");
        int n=s.nextInt();
        Stackimp1 ob=new Stackimp1(n);
        ob.push(5);
        ob.push(10);
        ob.push(12);
        ob.push(13);
        System.out.println("Element on the top of Stack: "+ob.peek());
        System.out.println("Popped Element: "+ob.pop());
        System.out.println("Element on the top of Stack: "+ob.peek());
        System.out.println("Size of stack : "+ob.size());
        System.out.println("Empty :"+ob.isempty());
        System.out.println("Full :"+ob.isfull());
        
    }
}
