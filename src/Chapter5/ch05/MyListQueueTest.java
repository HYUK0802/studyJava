package Chapter5.ch05;

public class MyListQueueTest {

    public static void main(String[] args) {
        MyLinkedQueue listQueue = new MyLinkedQueue();
        listQueue.enQueue("A");
        listQueue.enQueue("B");
        listQueue.enQueue("C");

        listQueue.printAll();

        System.out.println(listQueue.deQueue());


        listQueue.printAll();
    }
}
