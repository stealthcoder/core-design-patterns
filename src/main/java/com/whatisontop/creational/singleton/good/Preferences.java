package com.whatisontop.creational.singleton.good;

public class Preferences {

    private static Preferences instance = null;

    private static String _name;

    //ensure access is only for this and subclass
    protected Preferences(){}

    protected Preferences(String name){ _name = name;}

    private static synchronized void createInstance(String name)
    {
        if(instance == null)
            instance = new Preferences(name);
    }

    public static Preferences getInstance(String name)
    {
        if(instance == null)
            createInstance(name);

        return instance;
    }

    public void getDetails(){
        System.out.println(_name);
    }
}
