package home.Counter;

public class SimpleCounter implements Counter {
    private long val;
    private Object object = new Object();

    //private String name2;

//    public void SimpleCounter() {
//
//    }

    //synchronized public long inc() {
    public long inc() {
        synchronized(object) {
        return (  val++    );
        }
        //return val++;
    }

    private void tets1(){}
    public void tets2(){}

}


