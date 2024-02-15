package lesson8.GenericQueue;

public class Main {
    public static void main(String[] args) {
        //Integer
        System.out.println("Integer Queue: ");
        GenericQueue<Integer> intQueue = new GenericQueue<>();
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);
        intQueue.printQueue();
        intQueue.dequeue();
        intQueue.printQueue();
        System.out.println("Is the queue Empty: " + intQueue.isEmpty());

        //String
        System.out.println("String Queue: ");
        GenericQueue<String> stringQueue = new GenericQueue<>();
        stringQueue.enqueue("Snake");
        stringQueue.enqueue("Frog");
        stringQueue.enqueue("Cat");
        stringQueue.printQueue();
        stringQueue.dequeue();
        stringQueue.dequeue();
        stringQueue.printQueue();
        System.out.println("Is the queue Empty: " + stringQueue.isEmpty());

        //Double
        System.out.println("Double Queue:");
        GenericQueue<Double> doubleQueue = new GenericQueue<>();
        doubleQueue.enqueue(1.5);
        doubleQueue.enqueue(6.33);
        doubleQueue.enqueue(6.8);
        doubleQueue.printQueue();
        doubleQueue.dequeue();
        doubleQueue.dequeue();
        doubleQueue.printQueue();
        System.out.println("Is the queue Empty: " + doubleQueue.isEmpty());
    }
}
