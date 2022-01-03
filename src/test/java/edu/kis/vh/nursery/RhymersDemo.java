package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    private static final int ONE = 1;

    private static final int ZERO = 0;

    private static final int RANGE = 20;

    private static final int NO_RYMMERS = 3;

    private static final int NO_ELEMENTS = 15;

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();
        testRhymers (factory);
    }


    private static void testRhymers (Rhymersfactory factory) {
        DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer() };

        for (int i = ONE; i < NO_ELEMENTS; i++)
            for (int j = ZERO; j < NO_RYMMERS; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = ONE; i < NO_ELEMENTS; i++)
            rhymers[NO_RYMMERS].countIn(rn.nextInt(RANGE));

        for (DefaultCountingOutRhymer rhymer : rhymers) {
            while (!rhymer.callCheck())
                System.out.print(rhymer.countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[NO_RYMMERS]).reportRejected());
    }

}