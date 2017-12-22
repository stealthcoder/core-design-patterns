package com.whatisontop.creational.abstractfactory;



public class XClient {

    public static void main(String[] args) {

        XScrollBar bar = new XYellowThemeScrollBar();
        XWindow window = new XYellowThemeWindow();

        initializeGUI(bar,window);

        bar = new XPinkThemeScrollBar();
        window = new XYellowThemeWindow();

        initializeGUI(bar,window);


    }





    public static void initializeGUI(XScrollBar bar, XWindow window)
    {
        System.out.println("initializes UI logic with "+
                bar.getClass().getName()+" and "+ window.getClass().getName());
    }
}
