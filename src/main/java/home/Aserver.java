package home;

public abstract class Aserver {
    protected abstract boolean validate (String[] params);
    protected abstract void processContent();
    protected String onError () {return "FFFF";};

}
