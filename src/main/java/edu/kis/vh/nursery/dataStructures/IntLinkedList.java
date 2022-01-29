package edu.kis.vh.nursery.dataStructures;

public class IntLinkedList implements IntLinkedListInterface {

    private static final int DEFAULT = -1;
    Node last;
    int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return DEFAULT;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return DEFAULT;
        int ret = last.value;
        last = last.prev;
        return ret;
    }
}
