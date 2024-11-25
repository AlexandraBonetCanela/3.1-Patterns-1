package org.example;

import org.example.commands.Command;

public class ParkingManager {

    public void executeCommand(Command command) {
        command.execute();
    }
}
