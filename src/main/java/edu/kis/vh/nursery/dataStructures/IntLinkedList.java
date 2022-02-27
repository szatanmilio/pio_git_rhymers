package edu.kis.vh.nursery.dataStructures;

public class IntLinkedList implements IntStructure {

    private static final int DEFAULT = -1;
    private Node last;
    int i;

    @Override
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int top() {
        if (isEmpty())
            return IF_EMPTY;
        return last.value;
    }

    @Override
    public int pop() {
        if (isEmpty())
            return IF_EMPTY;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

    @Override
    public int getTotal() {
        return -1;
    }

}
