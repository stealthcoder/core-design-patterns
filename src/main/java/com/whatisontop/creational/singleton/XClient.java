package com.whatisontop.creational.singleton;

public class XClient {

    public static void main(String[] args) {

        System.out.println(XPreferences.globalPreferences.getPreference());

        XPreferences secondPref = new XPreferences("Second instance");

        //problem: mutable state as clients has access to it
        XPreferences.globalPreferences = secondPref;

        System.out.println(XPreferences.globalPreferences.getPreference());
    }
}
