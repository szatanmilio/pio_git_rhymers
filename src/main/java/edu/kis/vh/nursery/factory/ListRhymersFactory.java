package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.dataStructures.IntLinkedList;

public class ListRhymersFactory implements Rhymersfactory{
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        IntLinkedList stack = new IntLinkedList();
        return new DefaultCountingOutRhymer(stack);
    }

    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        IntLinkedList stack = new IntLinkedList();
        return new FIFORhymer(stack);
    }

    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }
}