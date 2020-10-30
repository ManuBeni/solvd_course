package com.solvd.carfactory.assembly;

import com.solvd.carfactory.assembly.parts.*;

public class Motorcycle extends Vehicle implements Buildable {
    public Motorcycle(){}
    public Motorcycle(Engine engine,Body body,Electronics electronics){
        super(engine,body,electronics);
    }

    public void build(){
        Body body = new Body(0,"purple",2);
        Electronics electronics = new Electronics(false,false);
        Engine engine = new Engine(600,90);
        this.setBody(body);
        this.setElectronics(electronics);
        this.setEngine(engine);
    }
}
