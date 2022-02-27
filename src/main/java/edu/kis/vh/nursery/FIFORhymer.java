package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntLinkedList;
import edu.kis.vh.nursery.dataStructures.IntStructure;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final IntStructure temp;

    public FIFORhymer(IntStructure temp){
        this.temp = temp;
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
