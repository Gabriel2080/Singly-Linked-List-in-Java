public class Main {
    public static void main(String[] args) {
        SinglyLinkedList test = new SinglyLinkedList();

        System.out.println("-----------------");

        test.removeElementFromList(2);

        System.out.println("-----------------");

        test.insertInOrder(2);
        test.insertInOrder(45);
        test.insertInOrder(74);
        test.insertInOrder(48);
        test.insertInOrder(47);
        test.insertInOrder(25);
        test.insertInOrder(27);
        test.insertInOrder(88);
        test.insertInOrder(7);

        test.removeElementFromList(89);
        test.removeElementFromList(2);
        test.removeElementFromList(88);

        test.insertInTheFirst(10);
        test.insertInLast(20);

        test.print();

        System.out.println("-----------------");

        System.out.println("head: " + test.getHead().getElement());
        System.out.println("tail: " + test.getTail().getElement());

        System.out.println("-----------------");

        System.out.println(test.elementInList(88));
        System.out.println(test.elementInList(20));
    }
}
