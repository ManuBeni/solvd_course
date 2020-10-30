package com.solvd.carfactory.assembly.parts;

public class Engine {
    private double engineDisplacement;
    private int horsePower;

    public Engine(double engineDisplacement, int  horsePower){
        this.engineDisplacement = engineDisplacement;
        this.horsePower = horsePower;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
