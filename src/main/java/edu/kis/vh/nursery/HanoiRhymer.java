package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntStructure;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public HanoiRhymer(IntStructure stack) {
        super(stack);
    }

    int totalRejected = 0;

    public HanoiRhymer() {

    }

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
