package edu.kis.vh.nursery.dataStructures;

public class IntLinkedList implements Structrues {

    private static final int DEFAULT = -1;
    Node last;
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
            return DEFAULT;
        return last.value;
    }

    @Override
    public int pop() {
        if (isEmpty())
            return DEFAULT;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

    @Override
    public void countIn(int in) {

    }

    @Override
    public int getTotal() {
        return 0;
    }

    @Override
    public boolean callCheck() {
        return false;
    }

    @Override
    public int peekaboo() {
        return 0;
    }

    @Override
    public int countOut() {
        return 0;
    }
}
