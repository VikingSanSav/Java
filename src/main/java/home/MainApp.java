package home;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */

    // https://www.youtube.com/results?search_query=6.+JAVA.+%D1%82%D0%B5%D1%85%D0%BD%D0%BE%D1%81%D1%82%D1%80%D0%B8%D0%BC
    // 6. JAVA. технострим
    public static void main(String... args) throws Exception {
        int cors = Runtime.getRuntime().availableProcessors();
        System.out.println(cors);

//        ArrayList <InstanceCounter> a = new ArrayList<InstanceCounter>();
//        for (int i=0;i<=3;i++) {
//            a.add(new InstanceCounter("Поток "+i));
//
//            //= new InstanceCounter("Поток "+i);
//            a.get(i).start();
//
//        }
//        for (int i=0;i<=4;i++) {
//            TimeUnit.SECONDS.sleep(1);
//            System.out.println("основной Поток. Время  "+i);
//            a.get(2).join();
//        }
    }




}


/*

        System.out.println("Hello world 2");
        Admin u1 = new Admin(1,"Bob");
        System.out.println(u1.id);
        User u2 = new User(1,"Bob2");
        System.out.println(u2.id);
        User bob = u1;
        System.out.println(bob.id);
        if (u1.equals(bob))
        //if (u1==bob)
              System.out.println(true);
        else  System.out.println(false);

    }


        class User {
            int id;
        }


        User userA = new User();
        userA.id = count++;
        int[][] a = new int[3][3];
        //a[0] = new int[2];

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <=2; j++) {
                if (i==j) {
                    a[i][j] = 1;
                }
                System.out.print(" " + a[i][j]+"  ");
            }
            System.out.println();
        }


        //System.out.println(userA.id);

        System.out.println("Hello world 2");
        int x = 37;
        int y = 4;
        System.out.println("x = " + Integer.toBinaryString(x));
        int z = (x<<1);
        System.out.println("x<<1 = " + Integer.toBinaryString(z));
        z = (x>>1);
        System.out.println( "x>>1 = " + Integer.toBinaryString(z));
        z = (x>>y);
        System.out.println("x = " + Integer.toBinaryString(x) +"  y = " + (y) + "  x>>y = " +  Integer.toBinaryString(z));
        z = (x>>>y);
        System.out.println("x = " + Integer.toBinaryString(x) +"  y = " + (y) + "  x>>>y = " +  Integer.toBinaryString(z));
        z = (x<<y);
        System.out.println("x = " + Integer.toBinaryString(x) +"  y = " + y + "  x<<y = " +  Integer.toBinaryString(z));
        z = (x&&y);
        System.out.println( "  ~x = " +  Integer.toBinaryString(z));
        z = (~y);
        System.out.println( "  ~y = " +  Integer.toBinaryString(z));
        z = ((~x)|(~y));
        System.out.println( " x|y = " +  Integer.toBinaryString(z));
        z = ((~x)^(~y));
        System.out.println( " x^y = " +  Integer.toBinaryString(z));
        z = ((~x)&(~y));
        System.out.println( " x&y = " +  Integer.toBinaryString(z));
        z = (x>>>y);
        System.out.println("x = " + x +"  y = " + (y) + "  x>>>y = " +  (z));
        z = (x<<y);
        System.out.println("x = " + (x) +"  y = " + y + "  x<<y = " +  (z));
        */

        //Main main = new Main();
        //main.addRouteBuilder(new MyRouteBuilder());
        //main.run(args);



/*        String first = args[0];
        int counter = 0;
        String[] newArr = new String[args.length];
        for (String arg1 : args) {
            for (String arg : args) {
                if (arg1.charAt(0) > arg.charAt(0)) {
                    counter++;
                }
            }
            newArr[counter] = arg1;
            counter = 0;
        }
        System.out.println(Arrays.toString(newArr));

        StrWrapper z = new StrWrapper("z");
        StrWrapper a = z;
        String b = "b";
        System.out.println("before met a =" + a.id + " ,b= "+ b + " ,z= " +z.id);
        someMethod(a,b);
        System.out.println("after met a = " + a.id + " ,b= "+ b + " ,z= " +z.id);

            static void someMethod(StrWrapper a, String b) {
        StrWrapper c = a;
        a.id = b;
        b = c.id;
        System.out.println(" in met a = " + a.id + " , b= "+ b);

    }


        */

