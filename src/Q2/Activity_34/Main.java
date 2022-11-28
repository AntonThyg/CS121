package Q2.Activity_34;
public class Main {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue("Tom");
        queue.enqueue("Jane");
        queue.enqueue("Beth");
        System.out.println(queue.displayQueue());

        queue.enqueue("John");
        queue.enqueue("Mary");
        System.out.println(queue.displayQueue());

        System.out.println("Queue is empty: "+queue.isEmpty());
        System.out.println("Number of items in queue: "+queue.size());
        System.out.println("Head of queue: "+queue.dequeue());

        System.out.println(queue.displayQueue());

        System.out.println("Queue is empty: "+queue.isEmpty());
        System.out.println("Queue length: "+queue.size());
        System.out.println("Head of queue: "+queue.dequeue());
        System.out.println("Head of queue: "+queue.dequeue());
        System.out.println("Head of queue: "+queue.dequeue());
        System.out.println("Head of queue: "+queue.dequeue());
        System.out.println("Head of queue: "+queue.dequeue());
        System.out.println("Queue is empty: "+queue.isEmpty());

    }
}
