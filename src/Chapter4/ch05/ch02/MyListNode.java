package Chapter4.ch05.ch02;

public class MyListNode {

    private String data;
    public MyListNode next; // 다음 노드를 가리키는 링크

    public MyListNode() {
        data = null;
        next = null;
    }

    public MyListNode(String data) {
        this.data = data;
        this.next = null;
    }

    public MyListNode(String data, MyListNode link) {
        this.data = data;
        this.next = link;
    }

    public String getData() {
        return data;
    }

    public MyListNode setData(String data) {
        this.data = data;
        return this;
    }

    public MyListNode getNext() {
        return next;
    }

    public MyListNode setNext(MyListNode next) {
        this.next = next;
        return this;
    }
}
