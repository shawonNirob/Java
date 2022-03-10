package dataStructure.stackImp;

public class Stack{
    private int top;
    public int data[];
    private int capasity;

    public Stack(int size){
        data = new int[size];
        capasity = size;
        top = -1;
    }
    public void push(int item){
        if(top < capasity-1){
            top = top + 1;
            data[top] = item;
        }else{
            System.out.println("Stack is full");
            System.exit(1);
        }
    }
    public int pop(){
        if(top<0){
            System.out.println("Stack is empty");
            System.exit(1);
        }
        int item = data[top];
        top = top - 1;

        return item;
    }
    public int peek(){
        if(top == -1) {
            System.out.println("Stack is empty");
            System.exit(1);
        }
        return data[top];
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        myStack.push(9);
        //System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        myStack.push(8);
        myStack.push(7);
        myStack.push(6);
        myStack.push(5);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        System.out.println(myStack.peek());
        System.out.println(myStack.pop());

        System.out.println(myStack.pop());

    }
}
