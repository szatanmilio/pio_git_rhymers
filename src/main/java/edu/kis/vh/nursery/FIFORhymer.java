package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntArraySTack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public final IntArraySTack temp = new IntArraySTack();

    public FIFORhymer() {
        super();
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
