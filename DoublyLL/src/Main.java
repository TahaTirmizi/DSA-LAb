public class Main {
    public static DoublyLL createSample() {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addLast(30);
        dll.addLast(40);
        dll.addLast(5);
        dll.addLast(50);
        return dll;
    }

    public static void main(String[] args) {
        DoublyLL dll;

        dll = createSample();
        System.out.println("Initial list forward:");
        dll.printForward();
        System.out.println("Initial list backward:");
        dll.printBackward();
        System.out.println();

        dll = createSample();
        dll.deleteFirst();
        System.out.println("After deleting first:");
        dll.printForward();
        System.out.println();

        dll = createSample();
        dll.deleteLast();
        System.out.println("After deleting last:");
        dll.printForward();
        System.out.println();

        dll = createSample();
        dll.deleteByValue(20);
        System.out.println("After deleting value 20:");
        dll.printForward();
        System.out.println();

        dll = createSample();
        dll.deleteBeforeValue(30);
        System.out.println("After deleting node before 30:");
        dll.printForward();
        System.out.println();

        dll = createSample();
        dll.deleteAfterValue(20);
        System.out.println("After deleting node after 20:");
        dll.printForward();
        System.out.println();

        dll = createSample();
        System.out.println("Min and Max of the list:");
        dll.findMinMax();
    }
}