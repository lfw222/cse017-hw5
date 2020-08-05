import java.util.ArrayList;
import java.util.Arrays;
public class Stack{
    private int [] list;
    private int top;
    private int capacity;
    private int size;
     
    
    public Stack(int capacity){
        this.list = new int [capacity];
        this.capacity = capacity;
        this.top = -1;
        this.size = 0;
    }
    public int pop(){
        if(this.top == 0){
            throw new RuntimeException("No more Items in list");
        }
        else{
           // list.remove(top);
            this.top -= 1;
            this.size -= 1;
            return list[top];
        }
    }
    public void push(int item){
        if (top == this.capacity){
            throw new RuntimeException("At max capacity");
        }
        else{    
            this.top += 1;
            this.list[top] = item;
            this.size += 1;
        }
    }
    public int peek(){
        if(this.size == 0){
            throw new RuntimeException("No more Items in list");
        }
        else{
            return list[top];
        }
    }
   public static void main(String [] args){
     Stack stack = new Stack(4);
     stack.push(1);
     //System.out.println(Arrays.toString(stack.list));
     stack.push(4);
     stack.push(3);
     stack.push(2);
     System.out.println(stack.peek());
     stack.pop();
     System.out.println(stack.peek());



   }
}