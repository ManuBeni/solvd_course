package com.solvd.carfactory.assembly;

import com.solvd.carfactory.assembly.parts.Body;
import com.solvd.carfactory.assembly.parts.Electronics;
import com.solvd.carfactory.assembly.parts.Engine;

public class Truck extends Vehicle implements Buildable {
    public Truck(){}
    public Truck(Engine engine, Body body, Electronics electronics){
        super(engine,body,electronics);
    }

    public void build(){
        Body body = new Body(2,"blue",6);
        Electronics electronics = new Electronics(true,false);
        Engine engine = new Engine(11.8,500);
        this.setBody(body);
        this.setElectronics(electronics);
        this.setEngine(engine);
    }
}
