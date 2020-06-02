package home.Counter;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class CounterTree {
   //enum s {i,j,k1};
   static class Sequencer extends Thread {
       private Counter counter;

       public Sequencer (Counter counter) {
           this.counter = counter;
       }

       @Override
       public void run() {
           for (int i = 0; i< 100_000; i++) {
               counter.inc();
           }
       }
   }

    static class SequencerT extends Thread {
        String b;

        public SequencerT () {
            b = "Okk";
        }

        @Override
        public void run() {
            System.out.println(b);
            }

    }


    public static void main (String ... str) throws Exception {

//        Counter counter = new SimpleCounter();
//        Sequencer sequencer = new Sequencer(counter);
//        sequencer.run();
//        System.out.println( counter.inc());

//        SimpleCounter counter = new SimpleCounter();
//            for (int i = 0; i< 100_000; i++) {
//                counter.inc();
//            }

        //System.out.println( counter.inc());

        int vTr = 2;
        Counter counter = new SimpleCounter();
        //Counter counter = new SimpleCounterAtomic();

        Thread[] treads = new Thread[vTr];

        for (int i = 0; i< vTr; i++){
            Thread tread = new Sequencer(counter);
            treads[i] = tread;
            tread.start();
            //tread.join();
        }
        //tread.join();

        for (Thread t : treads) {
            t.join();
        }
//        Thread ttt = new SequencerT();
//        ttt.start();
//        ttt.join();

        //TimeUnit.SECONDS.sleep(1);
        System.out.println( counter.inc());


    }
}
