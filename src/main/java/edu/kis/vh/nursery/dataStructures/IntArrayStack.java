package edu.kis.vh.nursery.dataStructures;

public class IntArrayStack implements Structrues {

    private static final int ARRAY_CAPACITY = 12;

    private static final int FULL_RHYMER_INDICATOR = 12;

    private static final int EMPTY_RHYMER_INDICATOR = -1;

    private static final int DEFAULT = 0;

    private final int[] numbers = new int[ARRAY_CAPACITY];

    public int total = EMPTY_RHYMER_INDICATOR;

    @Override
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public int getTotal() {
        return total;
    }

    @Override
    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    @Override
    public boolean isFull() {
        return total == FULL_RHYMER_INDICATOR;
    }

    @Override
    public int peekaboo() {
        if (callCheck())
            return DEFAULT;
        return numbers[total];
    }

    @Override
    public int countOut() {
        if (callCheck())
            return DEFAULT;
        return numbers[total--];
    }

    @Override
    public int top() {
        return 0;
    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public void push(int i) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
