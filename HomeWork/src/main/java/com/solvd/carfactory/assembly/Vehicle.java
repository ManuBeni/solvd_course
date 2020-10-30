package com.solvd.carfactory.assembly;

import com.solvd.carfactory.assembly.parts.*;

public abstract class Vehicle {
    private Engine engine;
    private Body body;
    private Electronics electronics;

    public Vehicle(){}

    public Vehicle(Engine engine,Body body,Electronics electronics){
        this.engine=engine;
        this.body=body;
        this.electronics=electronics;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Electronics getElectronics(){
        return electronics;
    }

    public void setElectronics(Electronics electronics){
        this.electronics=electronics;
    }
}
