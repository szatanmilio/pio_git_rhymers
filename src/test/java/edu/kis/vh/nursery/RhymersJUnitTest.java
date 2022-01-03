package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class to test all other classes and methods in project
 */
public class RhymersJUnitTest {

    /**
     * Method to test method countIn from DefaultCountingOutRhymer
     */
    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);
        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }
    /**
     * Method to test method callCheck from DefaultCountingOutRhymer
     */
    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertTrue(result);
        rhymer.countIn(888);
        result = rhymer.callCheck();
        Assert.assertFalse(result);
    }
    /**
     * Method to test method isFull from DefaultCountingOutRhymer
     */
    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int stackCapacity = 12;
        for (int i = 0; i < stackCapacity; i++) {
            boolean result = rhymer.isFull();
            Assert.assertFalse(result);
            rhymer.countIn(888);
        }
        boolean result = rhymer.isFull();
        Assert.assertTrue(result);
    }
    /**
     * Method to test method peekaboo from DefaultCountingOutRhymer
     */
    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int emptyStackValue = -1;
        int result = rhymer.peekaboo();
        Assert.assertEquals(emptyStackValue, result);
        int testValue = 4;
        rhymer.countIn(testValue);
        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }
    /**
     * Method to test method countOut from DefaultCountingOutRhymer
     */
    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int emptyStackValue = -1;
        int result = rhymer.countOut();
        Assert.assertEquals(emptyStackValue, result);
        int testValue = 4;
        rhymer.countIn(testValue);
        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(emptyStackValue, result);
    }
    /**
     * Method to test class FIFORhymer
     */
    @Test
    public void testFIFORhymer() {
        FIFORhymer rhymer = new FIFORhymer();
        final int emptyStackValue = -1;
        int result = rhymer.countOut();
        Assert.assertEquals(emptyStackValue, result);
        int testValue = 9;
        rhymer.countIn(testValue);
        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
    }
    /**
     * Method to test class HanoiRhymer
     */
    @Test
    public void testHanoiRhymer() {
        HanoiRhymer rhymer = new HanoiRhymer();
        final int expectedValue = 0;
        int result = rhymer.reportRejected();
        Assert.assertEquals(expectedValue, result);
    }
}


