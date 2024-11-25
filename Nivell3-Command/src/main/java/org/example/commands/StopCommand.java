package org.example.commands;

import org.example.vehicles.Vehicle;

public class StopCommand implements Command {

    private Vehicle vehicle;

    public StopCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.stop();
    }
}
