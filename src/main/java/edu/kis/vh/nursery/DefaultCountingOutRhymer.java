package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntLinkedList;
import edu.kis.vh.nursery.dataStructures.IntStructure;

public class DefaultCountingOutRhymer {
    private IntStructure stack;

    public DefaultCountingOutRhymer(IntStructure stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer() {
        stack = new IntLinkedList();
    }

    public void countIn(int in) {
        stack.push(in);
    }

    public boolean callCheck() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int countOut() {
        return stack.pop();
    }

    public int peekaboo() {
        return stack.top();
    }

    public int getTotal() {
        return stack.getTotal();
    }
}
