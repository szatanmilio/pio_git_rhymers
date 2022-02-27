package edu.kis.vh.nursery.factory;


import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.dataStructures.IntArrayStack;

public class StackRhymersFactory implements Rhymersfactory {
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        IntArrayStack stack = new IntArrayStack();
        return new DefaultCountingOutRhymer(stack);
    }

    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        IntArrayStack stack = new IntArrayStack();
        return new FIFORhymer(stack);
    }

    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }
}