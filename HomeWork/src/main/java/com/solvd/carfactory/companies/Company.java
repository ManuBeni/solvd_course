package com.solvd.carfactory.companies;

import com.solvd.carfactory.assembly.*;
import com.solvd.carfactory.companies.production.ProductionLine;
import com.solvd.carfactory.companies.workers.Employee;
import com.solvd.carfactory.companies.workers.Engineer;
import com.solvd.carfactory.companies.workers.Manager;
import com.solvd.carfactory.companies.workers.Worker;
import com.solvd.carfactory.exceptions.NoEmployeesAdded;
import com.solvd.carfactory.exceptions.NotEnoughCapitalForSalaries;
import com.solvd.carfactory.exceptions.NotEnoughEngineers;
import com.solvd.carfactory.exceptions.NotEnoughWorkers;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company {
    private CompanyNames name;
    private double capitalForSalaries;
    List<Manager> managerArea = new ArrayList<Manager>();
    List<Engineer> engArea = new ArrayList<Engineer>();
    List<Worker> workersArea = new ArrayList<Worker>();

    public Company() {
    }

    public Company(CompanyNames name, double capitalForSalaries) {
        this.name = name;
        this.capitalForSalaries = capitalForSalaries;
    }

    public void setName(CompanyNames name) {
        this.name = name;
    }

    public CompanyNames getName() {
        return name;
    }

    public void setCapitalForSalaries(double capitalForSalaries) {
        this.capitalForSalaries = capitalForSalaries;
    }

    public double getCapitalForSalaries() {
        return capitalForSalaries;
    }

    public void addEmployee(Manager manager) {
        managerArea.add(manager);
    }

    public void addEmployee(Engineer engineer) {
        engArea.add(engineer);
    }

    public void addEmployee(Worker worker) {
        workersArea.add(worker);
    }

    public List<Employee> getEmployees() throws NoEmployeesAdded {
        List<Employee> employees = new ArrayList<Employee>();
        employees.addAll(managerArea);
        employees.addAll(engArea);
        employees.addAll(workersArea);
        if (!employees.isEmpty()) {
            return employees;
        } else throw new NoEmployeesAdded("Add some employees.");
    }

    public void payToEmployees() throws NotEnoughCapitalForSalaries, NoEmployeesAdded {
        double toPay = getEmployees().stream().mapToDouble(Employee::getSalary).sum();
        if (capitalForSalaries >= toPay) {
            capitalForSalaries -= toPay;
        } else throw new NotEnoughCapitalForSalaries("Not enough capital to pay salaries.");
    }

    public long countOccupiedManagers(){
        return this.managerArea.stream()
                .filter(manager -> manager.isWorking())
                .count();
    }

    public long countNonOccupiedManagers(){
        return this.managerArea.stream()
                .filter(manager -> !manager.isWorking())
                .count();
    }

    public Vehicle buildAVehicle(TypeOfVehicle typeOfVehicle) throws NotEnoughWorkers, NotEnoughEngineers {
        for (Manager manager : managerArea) {
            Random random = new Random();
            if (!manager.isWorking()) {
                ProductionLine productionLine = new ProductionLine(typeOfVehicle);
                ArrayList<Worker> workers = new ArrayList<Worker>();
                int neededWorkers = manager.calculateWorkers(typeOfVehicle);
                if (neededWorkers <= this.workersArea.size()) {
                    for (int i = 0; i < neededWorkers; i++) {
                        List<Worker> tmpWorkers = this.workersArea;
                        int index = random.nextInt(tmpWorkers.size());
                        workers.add(tmpWorkers.get(index));
                    }
                } else throw new NotEnoughWorkers("Not enough workers for the project.");

                ArrayList<Engineer> engineers = new ArrayList<Engineer>();
                int neededEngineers = 3;
                if (neededEngineers <= this.engArea.size()) {
                    for (int i = 0; i < neededEngineers; i++) {
                        List<Engineer> tmpEngineers = this.engArea;
                        int index = random.nextInt(engineers.size());
                        engineers.add(tmpEngineers.get(index));
                    }
                } else throw new NotEnoughEngineers("Not enough engineers for the project.");

                manager.setWorking(true);
                manager.assignTeam(productionLine, engineers, workers);
                manager.setVehicleAssigned(typeOfVehicle);

                switch (typeOfVehicle) {
                    case E_CAR: {
                        ElectricCar electricCar = new ElectricCar();
                        electricCar.build();
                    }
                    case GAS_CAR: {
                        GasCar gasCar = new GasCar();
                        gasCar.build();
                    }
                    case TRUCK: {
                        Truck truck = new Truck();
                        truck.build();
                    }
                    case MOTORCYCLE: {
                        Motorcycle motorcycle = new Motorcycle();
                        motorcycle.build();
                    }
                }


            }
        }

        Vehicle vehicle = null;

        if (typeOfVehicle == TypeOfVehicle.E_CAR) {
            ElectricCar electricCar = new ElectricCar();
            electricCar.build();
            vehicle = electricCar;
        } else if (typeOfVehicle == TypeOfVehicle.GAS_CAR) {
            GasCar gasCar = new GasCar();
            gasCar.build();
            vehicle = gasCar;
        } else if (typeOfVehicle == TypeOfVehicle.TRUCK) {
            Truck truck = new Truck();
            truck.build();
            vehicle = truck;
        } else if (typeOfVehicle == TypeOfVehicle.MOTORCYCLE) {
            Motorcycle motorcycle = new Motorcycle();
            motorcycle.build();
            vehicle = motorcycle;
        }
        return vehicle;
    }

}
