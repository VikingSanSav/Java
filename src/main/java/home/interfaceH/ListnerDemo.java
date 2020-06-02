package home.interfaceH;

import java.util.*;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class ListnerDemo {

    public static void main(String... args) //throws Exception
    {
        Map<Integer, String> testMap = new HashMap<Integer, String>();
        testMap.put(1,"11d1");
        testMap.put(2,"2222");
        testMap.put(3,"3333");
        String first = testMap.get(2);

        System.out.println(testMap);
        System.out.println(first);
        for(Map.Entry<Integer, String> item : testMap.entrySet()){
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }

        List<Integer> testList = new ArrayList<>();
        for (int i=0; i<5; i++) testList.add((i));

        //=  Arrays.asList(1,2,3,4,5,7,8,12);
        testList.stream().forEach(System.out::println);




        /*if (true) System.out.println("QQ");
        try {
            try {throw new Exception("A");}
            catch (Exception e) {
                //System.err.println(e.getMessage());
                throw e;

            }
            finally {
                //if (true) { throw new IOException("B"); }
                throw new IOException("B");
                //System.err.println("C");
            }
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
            System.err.println("d1");
                    }
        catch (Exception e) {
            System.err.println("d2");
            System.err.println(e.getMessage());
        }*/


    }

    public static class Canvas implements home.interfaceH.ClickListner{

        @Override
        public void onClick () {  System.out.println("All end");}

    }

    public static class Penta implements home.interfaceH.ClickListner{
        public void allarm () {System.out.println("Allarm");}

        @Override
        public void onClick () {  allarm();}

    }

    public static class Button {
        private ClickListner[] cl = new ClickListner[10];
        private int count = 0;

        public void addLst(ClickListner s) {cl[count++] = s;}

        public void onClic () {
            for (int i=0; i<count; i++) {
                cl[i].onClick();
                //  cl[i].allarm();
            }
        }



    }



}
