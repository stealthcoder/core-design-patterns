package com.whatisontop.creational.factorymethod.good;

public class Client {

    public static void main(String[] args) {


        drive(new CarFactory());

        drive(new BikeFactory());


    }
    private static void drive(VehicleFactory factory)
    {

        Vehicle vehicle = factory.create();

        String drive = vehicle.drive();

        System.out.println(drive);

    }
}
