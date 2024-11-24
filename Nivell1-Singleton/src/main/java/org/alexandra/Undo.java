package org.alexandra;

import java.util.ArrayList;

public class Undo {
    private static Undo undo;
    private ArrayList<String> commands = new ArrayList<>();

    private Undo (){

    }

    public static Undo getInstance() {
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
