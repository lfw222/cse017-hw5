import java.util.ArrayList;
public class Queue {
    private int [] list;          // fixed size array that holds items of queue
    private int front;          // index of front of the queue
    private int back;         // index of the back of the queue
    private int capacity;        // how many items can the queue hold
    private int size;
    
    public Queue(int capacity){
        this.list = new int [capacity];
        this.capacity = capacity;
        this.front = 0;
        this.back = -1;
        this.size = 0;

    } // 1-arg constructor with initial capacity
    public int pop(){
        if(this.size == 0){
            throw new RuntimeException("This queue is empty");
        }
        else{
            this.front = (front + 1) % capacity;
            return list[front];
        }
    }        // return the front of the queue
    public void push(int item) {
        if (this.capacity == this.back){
            throw new RuntimeException("This queue is full");
        }
        else{
            this.back = (back + 1) % capacity;
            this.list[back] = item;
            this.size += 1;
        }

    }// add item to the back of the queue
    public int peek()   {
        if(this.size == 0){
            throw new RuntimeException("No more Items in list");
        }
        else{
            return list[front];
        }
    
    } // return the item at the front of the queue without removing it
    public int getsize(){
        return this.size;
    }
    public static void main (String [] args){
        Queue q = new Queue(4);
        /*q.push(1);
        System.out.println(q.peek());
        q.push(2);
        q.push(9);
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());*/


        
    }
}   