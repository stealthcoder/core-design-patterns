package com.whatisontop.creational.factorymethod.good;

public class CarFactory extends VehicleFactory{

    public Vehicle create() {
        return new Car();
    }
}
