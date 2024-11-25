package org.example;

import org.example.commands.Command;
import org.example.commands.StartCommand;
import org.example.commands.StopCommand;
import org.example.vehicles.Bicycle;
import org.example.vehicles.Car;
import org.example.vehicles.Ship;
import org.example.vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {

        ParkingManager parkingManager = new ParkingManager();

        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        Vehicle bicycle2 = new Bicycle();
        Vehicle ship = new Ship();

        Command startCar = new StartCommand(car);
        Command startBicycle = new StartCommand(bicycle);
        Command startBicycle2 = new StartCommand(bicycle2);
        Command startShip = new StartCommand(ship);
        Command stopCar = new StopCommand(car);

        parkingManager.executeCommand(startCar);
        parkingManager.executeCommand(startBicycle);
        parkingManager.executeCommand(startBicycle2);
        parkingManager.executeCommand(startShip);
        parkingManager.executeCommand(stopCar);

    }
}