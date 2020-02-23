package Lock;

public class Lock {
    boolean isLocked = false;

    public synchronized void lock() throws InterruptedException {
        while (isLocked){
            wait();
        }
        isLocked = true;
    }

    public synchronized void unlock() {
        notify();
        isLocked = false;

    }

}
