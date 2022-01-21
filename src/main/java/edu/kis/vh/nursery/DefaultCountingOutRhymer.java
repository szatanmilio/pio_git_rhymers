package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public IntArraySTack arraySTack = new IntArraySTack();

    public DefaultCountingOutRhymer(){}

    public DefaultCountingOutRhymer(IntArraySTack arraySTack) {
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

    public int peekaboo() {
        return arraySTack.peekaboo();
    }

    public int countOut() {
        return arraySTack.countOut();
    }
}
