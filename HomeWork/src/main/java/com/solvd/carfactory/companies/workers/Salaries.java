package com.solvd.carfactory.companies.workers;

public enum Salaries {
    ENGINEER(1000),
    MANAGER(1500),
    WORKER(500);

    private double salary;

    Salaries(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }
}
