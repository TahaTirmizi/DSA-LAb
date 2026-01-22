class QueueArray {
    private int[] arr;
    private int size;
    private int front;
    private int rear;

    public QueueArray(int capacity) {
        arr = new int[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (size == arr.length) {
            resize();
        }
        rear++;
        arr[rear] = value;
        size++;
        System.out.println(value + " enqueued");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int removed = arr[front];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        size--;
        return removed;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        int newSize = arr.length * 2;
        int[] newArr = new int[newSize];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        System.out.println("Queue resized to " + newSize);
    }

    public void printQueue() {
        System.out.print("Queue: ");
        for (int i = 0; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void findMinMax() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i <= rear; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}

public class Main {
    public static void main(String[] args) {
        QueueArray q = new QueueArray(3);

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
