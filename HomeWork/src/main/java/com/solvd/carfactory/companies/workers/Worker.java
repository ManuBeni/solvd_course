package com.solvd.carfactory.companies.workers;

import java.util.function.ToDoubleBiFunction;

public class Worker extends Employee implements ISalary,IWork{

    public String area;

    public Worker(){}

    public Worker(String firstName,String lastName,String email,Salaries salary){
        super(firstName,lastName,email,salary);
    }

    public void setArea(){
        this.area = area;
    }

    public String getArea(){
        return area;
    }

    public void work(){
        // TODO
    }
    public void calculateSalary(){
        // TODO
    }
}
