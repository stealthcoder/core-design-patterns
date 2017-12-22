package com.whatisontop.creational.factorymethod.good;

public class BikeFactory extends VehicleFactory{

    public Vehicle create() {
        return new Bike();
    }
}
