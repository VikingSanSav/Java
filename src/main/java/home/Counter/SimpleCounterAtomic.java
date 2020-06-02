package home.Counter;

import java.util.concurrent.atomic.AtomicLong;

public class SimpleCounterAtomic extends SimpleCounter{
    private AtomicLong val = new AtomicLong();
    //private long t;

    public long inc() {
        return val.getAndIncrement();
        //return val++;
    }

    @Override
    public void tets2() {
        super.tets2();
    }
}