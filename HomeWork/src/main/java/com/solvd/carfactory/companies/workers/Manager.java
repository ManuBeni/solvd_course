package com.solvd.carfactory.companies.workers;

import com.solvd.carfactory.assembly.TypeOfVehicle;
import com.solvd.carfactory.companies.production.ProductionLine;

import java.util.ArrayList;

public class Manager extends Employee implements ISalary,IWork{

    private TypeOfVehicle carAssigned;
    private boolean isWorking;

    public Manager(){}

    public Manager(String firstname,String lastname, String email,Salaries salary){
        super(firstname,lastname,email,salary);
    }

    public TypeOfVehicle getVehicleAssigned() {
        return carAssigned;
    }

    public void setVehicleAssigned(TypeOfVehicle carAssigned) {
        this.carAssigned = carAssigned;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public void assignTeam(ProductionLine production,ArrayList<Engineer> engineers, ArrayList<Worker> workers){
        engineers.stream().forEach(production::addEngineer);
        workers.stream().forEach(production::addWorker);
    }

    public int calculateWorkers(TypeOfVehicle typeOfVehicle){
        switch (typeOfVehicle){
            case GAS_CAR: return 400;
            case TRUCK: return 600;
            case E_CAR: return 500;
            case MOTORCYCLE: return 300;
        }
        return 0;
    }



    public void work(){
        //TODO
    }
    public void calculateSalary(){
        //TODO
    }
}
