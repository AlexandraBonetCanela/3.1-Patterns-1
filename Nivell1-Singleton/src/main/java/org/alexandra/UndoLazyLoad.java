package org.alexandra;

import java.util.ArrayList;

//LazyLoad doesn't consume resources if an instance is never requested
public class UndoLazyLoad {
    // volatile: always push when changes from cache. Last written value of Volatile variable is always visible for all readers/threads.
    private static volatile UndoLazyLoad undo;
    private ArrayList<String> commands = new ArrayList<>();

    private UndoLazyLoad(){
    }

    public static UndoLazyLoad getInstance() {
        // test if undo is null 'cause synchronized is expensive
        if(undo == null){
            synchronized (UndoLazyLoad.class){
                if(undo == null){
                    undo = new UndoLazyLoad();
                }
            }
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
