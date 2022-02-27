package edu.kis.vh.nursery.dataStructures;

public interface IntStructure {
    final int IF_EMPTY = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}
