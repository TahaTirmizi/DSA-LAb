class DoublyLL {
    Node head, tail;

    class Node {
        int data;
        Node next, prev;
        Node(int data) {
            this.data = data;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ⇆ ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ⇆ ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) {
            head = tail = null;
            System.out.println("First node deleted.");
            return;
        }
        head = head.next;
        head.prev = null;
        System.out.println("First node deleted.");
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) {
            head = tail = null;
            System.out.println("Last node deleted.");
            return;
        }
        tail = tail.prev;
        tail.next = null;
        System.out.println("Last node deleted.");
    }

    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        if (temp.data == value) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            System.out.println(value + " deleted.");
            return;
        }
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value not found.");
            return;
        }
        if (temp.next == null) {
            tail = temp.prev;
            tail.next = null;
        } else {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        System.out.println(value + " deleted.");
    }

    public void deleteBeforeValue(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value not found.");
            return;
        }
        if (temp.prev == null) {
            System.out.println("No node before value.");
            return;
        }
        Node toDelete = temp.prev;
        Node before = toDelete.prev;
        if (before != null) {
            before.next = temp;
            temp.prev = before;
        } else {
            head = temp;
            head.prev = null;
        }
        if (toDelete == tail) {
            tail = toDelete.prev;
        }
        System.out.println(toDelete.data + " deleted.");
    }

    public void deleteAfterValue(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value not found.");
            return;
        }
        if (temp.next == null) {
            System.out.println("No node after value.");
            return;
        }
        Node toDelete = temp.next;
        Node after = toDelete.next;
        temp.next = after;
        if (after != null) {
            after.prev = temp;
        } else {
            tail = temp;
        }
        System.out.println(toDelete.data + " deleted.");
    }

    public void findMinMax() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        int min = head.data;
        int max = head.data;
        Node temp = head.next;
        while (temp != null) {
            if (temp.data < min) min = temp.data;
            if (temp.data > max) max = temp.data;
            temp = temp.next;
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}


