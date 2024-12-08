package org.alexandra;

import java.util.Scanner;

public class MainLazyLoad {
    private static boolean finish;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        finish = false;
        System.out.println("Welcome to AddYourCommandsApplication!");
        System.out.println("Add as many commands as you want, to undo last command type 'undo', to see last commands type 'history' and to finish type 'finish'");

        while (!finish){
            String command = scanner.nextLine().toUpperCase();
            processCommand(command);
        }
        System.out.println("Thank you for spending time with us today. See you next time!");
    }

    public static void processCommand(String command){
        switch (command){
            case "FINISH":
                finish = true;
                break;
            case "UNDO":
                UndoLazyLoad.getInstance().removeLastCommand();
                System.out.println("command undone");
                break;
            case "HISTORY":
                System.out.println("Last commands:");
                UndoLazyLoad.getInstance().showHistory();
                break;
            default:
                UndoLazyLoad.getInstance().addCommand(command);
        }
    }
}