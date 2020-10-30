package com.solvd.carfactory.assembly;

import com.solvd.carfactory.assembly.parts.Body;
import com.solvd.carfactory.assembly.parts.Electronics;
import com.solvd.carfactory.assembly.parts.Engine;

public class ElectricCar extends Vehicle implements Buildable {

    public ElectricCar(){}

    public ElectricCar(Engine engine, Body body, Electronics electronics){
        super(engine,body,electronics);
    }

    public void build() {
            Body body = new Body(5,"white",4);
            Electronics electronics = new Electronics(true,true);
            Engine engine = new Engine(100,600);
            this.setBody(body);
            this.setElectronics(electronics);
            this.setEngine(engine);
    }
}
