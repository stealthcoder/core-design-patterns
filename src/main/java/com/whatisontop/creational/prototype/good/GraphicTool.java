package com.whatisontop.creational.prototype.good;

public class GraphicTool {

    public void setPrototype(Graphic prototype) {
        this.prototype = prototype;
    }

    private Graphic prototype;

    public GraphicTool(Graphic prototype){
        this.prototype = prototype;
    }

    protected Graphic createGraphic(){
        return prototype.clone();
    }


}
