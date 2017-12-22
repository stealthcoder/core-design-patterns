package com.whatisontop.creational.abstractfactory.good;

public class YellowThemeWidgetFactory implements WidgetFactory{
    public ScrollBar createScrollBar() {
        return new YellowThemeScrollBar();
    }

    public Window createWindow() {
        return new YellowThemeWindow();
    }
}
