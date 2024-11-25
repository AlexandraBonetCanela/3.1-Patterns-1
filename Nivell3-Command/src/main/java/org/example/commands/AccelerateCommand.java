package org.example.commands;

import org.example.vehicles.Vehicle;

public class AccelerateCommand implements Command {

    private Vehicle vehicle;

    public AccelerateCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }
}
