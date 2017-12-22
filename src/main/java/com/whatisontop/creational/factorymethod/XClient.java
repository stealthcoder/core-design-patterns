package com.whatisontop.creational.factorymethod;

public class XClient {

    public static void main(String[] args) {

        XVehicle vehicle = new XVehicle();
        System.out.println(vehicle.drive());
    }
}
