package com.whatisontop.creational.prototype.good;

public class Image extends Graphic{

    private String url;

    @Override
    public Graphic clone() {

        Image clone = new Image();
        clone.setUrl(this.url);
        return clone;
    }

    @Override
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url){
        this.url = url;
    }


}
