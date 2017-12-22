package com.whatisontop.creational.abstractfactory.good;

public class Client {

    public static void main(String[] args) {

        WidgetFactory factory = new YellowThemeWidgetFactory();
        initializeGUI(factory);

        factory = new PinkThemeWidgetFactory();
        initializeGUI(factory);

    }

    public static void initializeGUI(WidgetFactory factory)
    {
        initializeGUI(
                factory.createScrollBar(),
                factory.createWindow(),
                factory.createLayout());
    }

    public static void initializeGUI(ScrollBar bar, Window window, Layout layout)
    {
        System.out.println("initializes UI logic with "+
                bar.getClass().getName()+" and "+
                window.getClass().getName() +" and "+
                layout.getClass().getName());
    }
}
