package edu.kis.vh.nursery;

public class IntArraySTack {

    private static final int SIZE = 12;
    private static final int FULL = 11;
    private static final int EMPTY = -1;
    private int[] numbers = new int[SIZE];
    public int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }
}
