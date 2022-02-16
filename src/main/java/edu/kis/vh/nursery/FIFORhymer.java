package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer(IntArrayStack stack) {
        super(stack);
    }

    public FIFORhymer(){

    }

    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }
}
