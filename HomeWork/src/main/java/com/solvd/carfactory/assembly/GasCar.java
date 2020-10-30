package com.solvd.carfactory.assembly;

import com.solvd.carfactory.assembly.parts.Body;
import com.solvd.carfactory.assembly.parts.Electronics;
import com.solvd.carfactory.assembly.parts.Engine;

public class GasCar extends Vehicle implements Buildable {

    public GasCar(){}

    public GasCar(Engine engine, Body body, Electronics electronics){
        super(engine,body,electronics);
    }

    public void build() {
        Body body = new Body(5,"red",4);
        Electronics electronics = new Electronics(true,false);
        Engine engine = new Engine(1.8,450);
        this.setBody(body);
        this.setElectronics(electronics);
        this.setEngine(engine);
    }
}
