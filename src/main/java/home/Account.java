package home;

public class Account {
    static int idCounter =0;
    int id;

    public Account () { id = idCounter++;}

    public static Account createAccount () {
        System.out.println("Account create ");
        return new Account();
    }

    //@Override
    public String toStribg () {
        return "Account " + id;
    }
}
