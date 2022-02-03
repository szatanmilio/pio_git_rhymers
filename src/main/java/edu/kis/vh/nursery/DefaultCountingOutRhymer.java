package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntArrayStack;

public class DefaultCountingOutRhymer {
    public IntArrayStack arraySTack = new IntArrayStack();

    public DefaultCountingOutRhymer(){}

    public DefaultCountingOutRhymer(IntArrayStack arraySTack) {
        this.arraySTack = arraySTack;
    }

    public void countIn(int in) {
        arraySTack.countIn(in);
    }

    public int getTotal() {
        return arraySTack.getTotal();
    }

    public boolean callCheck() {
        return arraySTack.callCheck();
    }

    public boolean isFull() {
        return arraySTack.isFull();
    }

    protected int peekaboo() {
        return arraySTack.peekaboo();
    }

    public int countOut() {
        return arraySTack.countOut();
    }
}
