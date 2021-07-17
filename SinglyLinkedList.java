public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void insertInTheFirst(int element) {
        Node add = new Node(element);
        if (isEmpty()) {
            head = add;
            tail = add;
            size++;
        } else {
            add.setNext(head);
            head = add;
            size++;
        }
    }

    public void insertInLast(int element) {
        if (isEmpty()) {
            insertInTheFirst(element);
        } else {
            Node add = new Node(element);
            tail.setNext(add);
            tail = add;
            size++;
        }
    }

    public void insertInOrder(int element) {
        if (isEmpty() || head.getElement() >= element) {
            insertInTheFirst(element);
        } else if (tail.getElement() <= element) {
            insertInLast(element);
        } else {
            Node p = head;
            while (true) {
                if (p.getNext().getElement() >= element) {
                    Node add = new Node(element);
                    add.setNext(p.getNext());
                    p.setNext(add);
                    size++;
                    break;
                }
                p = p.getNext();
            }
        }
    }

    public boolean elementInList(int element) {
        Node p = head;
        while (p != null) {
            if (p.getElement() == element) {
                return true;
            }
            p = p.getNext();
        }
        return false;
    }

    public void removeElementFromList(int element) {
        Node p = head;
        if (isEmpty()) {
            System.out.println("list is empty");
        } else if (p.getElement() == element) {
            head = p.getNext();
            size--;
        } else {
            while (p.getNext() != null) {
                if (p.getNext().getElement() == element) {
                    p.setNext(p.getNext().getNext());
                    if (element == tail.getElement()) {
                        tail = p;
                    }
                    size--;
                    break;
                }
                p = p.getNext();
            }
        }
    }

    public void print() {
        Node p = head;
        while (p != null) {
            System.out.println(p.getElement());
            p = p.getNext();
        }
        System.out.println("size: "+ size);
    }

    public int getSize() {
        return size;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
}
