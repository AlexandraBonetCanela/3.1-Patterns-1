package org.alexandra;

import java.util.ArrayList;

public class UndoClassLoad {
    private static UndoClassLoad undo = new UndoClassLoad();
    private ArrayList<String> commands = new ArrayList<>();

    private UndoClassLoad(){
    }

    public static UndoClassLoad getInstance() {
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
