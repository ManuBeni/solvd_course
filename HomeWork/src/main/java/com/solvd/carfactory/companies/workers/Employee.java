package com.solvd.carfactory.companies.workers;

public abstract class Employee{
    private String firstName;
    private String lastName;
    private Salaries salary;
    private String email;

    public Employee(String firstName,String lastName, String email,Salaries salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary=salary;
    }

    public Employee(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary.getSalary();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
