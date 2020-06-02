package home.Counter;

import java.util.concurrent.TimeUnit;

public class InstanceCounter extends Thread{

    public static int numInstances = 0;
    private int numInstancesLocal = 0;
    public String name;

    public InstanceCounter() {
        this.name = "NoPar";
        InstanceCounter.addInstance();
        numInstancesLocal = numInstances;
        //return name;
    }
    public InstanceCounter(String name) {
        this.name = name;
        InstanceCounter.addInstance();
        numInstancesLocal = numInstances;
        //return name;
    }

    @Override
    public void run() {
        insransThread();
    }

    protected int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;

    }

    public void insransThread() {
        //System.out.println("Начиная с " + InstanceCounter.getCount() + " экземпляра");
        try {
            for (int i = 0; i < 3; ++i){
                //InstanceCounter t = new InstanceCounter(" Экземпляр = " + i);
                //TimeUnit.SECONDS.sleep(numInstancesLocal);
                TimeUnit.SECONDS.sleep(1);
                System.out.println(this.name + " time = " +
                        1);
            }
        }
        catch (InterruptedException e) { e.printStackTrace();}
    }


}
