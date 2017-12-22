package com.whatisontop.creational.abstractfactory.good;

public class PinkThemeWidgetFactory implements WidgetFactory
{
    public ScrollBar createScrollBar() {
        return new PinkThemeScrollBar();
    }

    public Window createWindow() {
        return new PinkThemeWindow();
    }

    //no implementation of createLayout()
    // so it uses the 'default' method from parent

}
