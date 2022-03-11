package dataStructure.queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue call = new Queue(5);
        call.deQueue();
        call.enQueue(65);
        call.enQueue(50);
        call.enQueue(40);
        call.enQueue(30);
        call.enQueue(20);
        call.enQueue(10);
        System.out.println(call.deQueue());
        System.out.println(call.deQueue());
        System.out.println(call.deQueue());
        System.out.println(call.deQueue());
        System.out.println(call.deQueue());
        System.out.println(call.deQueue());

        call.enQueue(1000);
        System.out.println(call.peek());
    }
}
