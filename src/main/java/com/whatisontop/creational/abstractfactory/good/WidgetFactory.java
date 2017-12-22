package com.whatisontop.creational.abstractfactory.good;

public interface WidgetFactory {

    ScrollBar createScrollBar();

    Window createWindow();

    default public Layout createLayout(){
         return new  DefaultLayout();

    }
}
