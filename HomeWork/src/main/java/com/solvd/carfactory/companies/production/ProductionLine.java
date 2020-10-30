package com.solvd.carfactory.companies.production;

import com.solvd.carfactory.assembly.TypeOfVehicle;
import com.solvd.carfactory.companies.workers.Engineer;
import com.solvd.carfactory.companies.workers.Manager;
import com.solvd.carfactory.companies.workers.Worker;

import java.util.ArrayList;
import java.util.List;

public class ProductionLine {
    private TypeOfVehicle typeOfVehicle;
    private List<Engineer> engineers = new ArrayList<Engineer>();
    private Manager manager;
    private List<Worker> workers = new ArrayList<Worker>();
    private boolean finished = false;

    public ProductionLine(TypeOfVehicle typeOfVehicle){
        this.typeOfVehicle=typeOfVehicle;
    }

    public void setTypeOfVehicle(TypeOfVehicle typeOfVehicle){
        this.typeOfVehicle = typeOfVehicle;
    }

    public TypeOfVehicle getTypeOfVehicle(){
        return typeOfVehicle;
    }

    public void setManager(Manager manager){
        this.manager=manager;
    }

    public Manager getManager(){
        return manager;
    }

    public void addEngineer(Engineer engineer){
        this.engineers.add(engineer);
    }

    public void removeEngineer(Engineer engineer){
        this.engineers.remove(engineer);
    }

    public List<Engineer> getEngineers(){
        return this.engineers;
    }

    public void addWorker(Worker worker){
        this.workers.add(worker);
    }

    public void removeWorker(Worker worker){
        this.workers.remove(worker);
    }

    public List<Worker> getWorkers(){
        return this.workers;
    }

    public boolean isFinished(){
        return this.finished;
    }

    public void finish(){
        this.finished = true;
    }

}
