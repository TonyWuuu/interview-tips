package com.tony.interview.mutex;

public class SequenceGenerator {

    private int currentValue = 0;

    public int getNextSequence() {
        currentValue = currentValue + 1;
        return currentValue;
    }

}
