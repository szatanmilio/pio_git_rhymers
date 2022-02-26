package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final IntLinkedList temp = new IntLinkedList();

    public FIFORhymer(IntLinkedList stack) {
        super(stack);
    }

    public FIFORhymer(){

    }
    
    @Override
    public int countOut() {
        while (!callCheck())

            temp.push(super.countOut());

        int ret = temp.pop();

        while (!temp.isEmpty())

            countIn(temp.pop());

        return ret;
    }
}
