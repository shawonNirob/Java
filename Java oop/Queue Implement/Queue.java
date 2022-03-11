package dataStructure.queue;

public class Queue {
    public int[] data;
    public int head;
    public int tail;
    public int capacity;
    public Queue(int size){
        head=0;
        tail=0;
        capacity = size;
        data = new int [capacity+1];
    }
    public void enQueue(int item){
        if(isFull()) {
            System.out.println("Queue is Full!");
            return;
        }
        data[tail] = item;
        tail= (tail+1) % (capacity+1);
    }
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return -1;
        }
        int item = data[head];
        head = (head+1) % (capacity+1);
        return item;
    }
    public int peek(){
        return data[head];
    }
    public boolean isFull(){
        if((tail+1) % (capacity+1) == head) return true;
        return false;
    }
    public boolean isEmpty() {
        if (head == tail) return true;
        return false;
    }
}
