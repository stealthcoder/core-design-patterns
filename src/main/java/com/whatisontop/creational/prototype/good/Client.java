package com.whatisontop.creational.prototype.good;

public class Client {

    public static void main(String[] args) {
        Image image = new Image();
        image.setUrl("image.com");
        
        GraphicTool tool = new GraphicTool(image);


        Graphic graphic = tool.createGraphic();

        System.out.println("graphic instance: "+ graphic.getClass());
        System.out.println("graphic url: "+ graphic.getUrl());


        Video video = new Video();
        video.setUrl("video.com");

        tool.setPrototype(video);

        graphic = tool.createGraphic();

        System.out.println("graphic instance: "+ graphic.getClass());
        System.out.println("graphic url: "+ graphic.getUrl());

    }
}
