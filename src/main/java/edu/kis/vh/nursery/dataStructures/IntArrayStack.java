package edu.kis.vh.nursery.dataStructures;

public class IntArrayStack implements IntStructure {

    private static final int ARRAY_CAPACITY = 12;

    private static final int FULL_RHYMER_INDICATOR = ARRAY_CAPACITY - 1;

    private static final int EMPTY_RHYMER_INDICATOR = -1;

    private static final int DEFAULT = 0;

    private final int[] numbers = new int[ARRAY_CAPACITY];

    public int total = EMPTY_RHYMER_INDICATOR;

    public boolean isFull() {
        return total == FULL_RHYMER_INDICATOR;
    }

    @Override
    public void push(int i) {
        if (!isFull())
            numbers[++total] = i;
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    @Override
    public int top() {
        if (isEmpty())
            return DEFAULT;
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return DEFAULT;
        return numbers[total--];
    }
}
