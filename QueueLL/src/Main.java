class QueueLinkedList {
    private Node front;
    private Node rear;

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(value + " enqueued");
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int removed = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return removed;
    }

    public int peek() {
        if (front == null) {
            return -1;
        }
        return front.data;
    }

    public void findMinMax() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        int min = front.data;
        int max = front.data;
        Node temp = front.next;
        while (temp != null) {
            if (temp.data < min) min = temp.data;
            if (temp.data > max) max = temp.data;
            temp = temp.next;
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public void printQueue() {
        System.out.print("Queue: ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.printQueue();

        System.out.println("Front element: " + q.peek());

        q.findMinMax();

        q.dequeue();
        q.printQueue();
    }
}
