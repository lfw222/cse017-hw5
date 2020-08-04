import java.util.ArrayList;
public class Stack{
    private static ArrayList<Integer> list;
    private static int top;
    private static int capacity;
    private static int size;
    
        
    public Stack(int capacity){
        capacity = 10;
        list = new ArrayList <Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        top = 9;
        size = list.size();
    }
    public int pop(){
        if(top == 0){
            throw new RuntimeException("No more Items in list");
        }
        else{
           // list.remove(top);
            top -= 1;
            size -= 1;
            return list.remove(top + 1);
        }
    }
    public void push(int item){
        if (top == capacity){
            throw new RuntimeException("At max capacity");
        }
        else{
            list.add(item);
            item = list.get(top);
            top += 1;
            size += 1;
        }
    }
    public int peek(){
        if(top == 0){
            throw new RuntimeException("No more Items in list");
        }
        else{
            return list.get(top);
        }
    }
   public static void main(String [] args){
       Stack stack = new Stack(capacity);
       System.out.println(list);
       System.out.println(list.get(top));
       stack.pop();
       System.out.println(list.get(top));
       System.out.println(list);

        stack.push(4);
        System.out.println(list.get(top));
        System.out.println(list);
   }
}