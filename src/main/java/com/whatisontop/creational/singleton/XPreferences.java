package com.whatisontop.creational.singleton;

public class XPreferences {

    public static XPreferences globalPreferences = new XPreferences("First instance");
    public String getPreference() {
        return preference;
    }

    public XPreferences(String preference) {this.preference = preference;}

    private String preference;


}
