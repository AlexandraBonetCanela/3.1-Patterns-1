package org.alexandra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean finish = false;
        System.out.println("Welcome to AddYourCommandsApplication!");
        System.out.println("Add as many commands as you want, to undo last command type 'undo', to see last commands type 'history' and to finish type 'finish'");
        Undo undo = Undo.getUndo();

        while (!finish){
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("FINISH")){
                finish = true;
            }
            else if (command.equalsIgnoreCase("UNDO")){
                undo.removeLastCommand();
                System.out.println("command undone");
            }
            else if (command.equalsIgnoreCase("HISTORY")){
                System.out.println("Last commands:");
                undo.showHistory();
            }
            else {
                undo.addCommand(command);
            }
        }
        System.out.println("Thank you for spending time with us today. See you next time!");
    }
}