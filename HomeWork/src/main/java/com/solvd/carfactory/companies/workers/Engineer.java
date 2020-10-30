package com.solvd.carfactory.companies.workers;

public class Engineer extends Employee implements ISalary,IWork {

    private String field;

    public Engineer(){}

    public Engineer(String firstName,String lastName,String email, Salaries salary){
        super(firstName,lastName,email,salary);
    }


    public void setField(){
        this.field = field;
    }

    public String getField(){
        return field;
    }

    public void work(){
        // TODO
    }

    public void calculateSalary(){
        //TODO
    }
}
