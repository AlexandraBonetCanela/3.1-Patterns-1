package org.alexandra;

import java.util.ArrayList;

public class Undo {
    private static Undo undo;
    private ArrayList<String> commands = new ArrayList<>();

    public static Undo getUndo() {
        if (undo == null) {
            undo = new Undo();
        }
        return undo;
    }

    public void addCommand(String command){
        commands.add(command);
    }

    public void removeLastCommand(){
        if (!commands.isEmpty()){
            commands.remove(commands.size()-1);
        }
    }

    public void showHistory(){
        commands.forEach(System.out::println);
    }
}
