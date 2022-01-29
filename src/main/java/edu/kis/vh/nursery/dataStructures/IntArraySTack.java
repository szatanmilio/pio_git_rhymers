package edu.kis.vh.nursery.dataStructures;

public class IntArraySTack implements IntArraySTackInterface {

    private static final int ARRAY_CAPACITY = 12;

    private static final int FULL_RHYMER_INDICATOR = 11;

    private static final int EMPTY_RHYMER_INDICATOR = -1;

    private static final int DEFAULT = 0;

    private final int[] numbers = new int[ARRAY_CAPACITY];

    public int total = EMPTY_RHYMER_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public int getTotal() {
        return total;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == FULL_RHYMER_INDICATOR;
    }

    public int peekaboo() {
        if (callCheck())
            return DEFAULT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT;
        return numbers[total--];
    }
}
