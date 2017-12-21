package com.whatisontop.creational.singleton.good;

public class Client {
    public static void main(String[] args)
    {

        Preferences.getInstance("first").getDetails();

        //does not override state change
        SubPreference.getInstance("sub").getDetails();

    }
}
