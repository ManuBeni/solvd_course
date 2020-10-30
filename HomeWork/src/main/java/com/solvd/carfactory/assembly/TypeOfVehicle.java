package com.solvd.carfactory.assembly;

public enum TypeOfVehicle {

    GAS_CAR(4),
    E_CAR(4),
    MOTORCYCLE(2),
    TRUCK(6);

    private int wheels;

    TypeOfVehicle(int wheels){
        this.wheels = wheels;
    }
}
