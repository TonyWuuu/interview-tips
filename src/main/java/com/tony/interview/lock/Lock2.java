package com.tony.interview.lock;

public class Lock2 {
    boolean isLocked = false;
    Thread lockedBy  = null;
    int lockCount = 0;

    public synchronized void lock() throws InterruptedException {
        Thread t = Thread.currentThread();

        while (isLocked && lockedBy != t){
            wait();
        }
        isLocked = true;
        lockCount++;
        lockedBy = t;
    }

    public synchronized void unlock() {
        Thread t = Thread.currentThread();
        if (t == lockedBy){
            lockCount--;
            if (lockCount ==0){
                isLocked = false;
                notify();
            }
        }
    }

}
