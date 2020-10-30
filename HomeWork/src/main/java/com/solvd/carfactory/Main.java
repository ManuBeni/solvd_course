package com.solvd.carfactory;

import com.solvd.carfactory.assembly.TypeOfVehicle;
import com.solvd.carfactory.assembly.Vehicle;
import com.solvd.carfactory.companies.Company;
import com.solvd.carfactory.companies.workers.Manager;
import com.solvd.carfactory.exceptions.NotEnoughEngineers;
import com.solvd.carfactory.exceptions.NotEnoughWorkers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws NotEnoughWorkers, NotEnoughEngineers {
        Company company=new Company();
        Manager manager = new Manager();
        company.addEmployee(manager);
        try {
            Vehicle vehicle = company.buildAVehicle(TypeOfVehicle.E_CAR);
        }catch (NotEnoughWorkers e){
            logger.info("Not Enough Workers");
        }
    }
}
