package p06_02_user_interface;

import java.util.Scanner;

public class UserInterface602b {
    private TodoList todoList; 
    private Scanner scanner; 

    public UserInterface602b(TodoList todoList, Scanner scanner) {
        this.todoList = todoList; 
        this.scanner = scanner; 
    }

    public void start() {
        while (true) {
            String command = scanner.nextLine(); 
            if (command.equalsIgnoreCase("stop")) {
                break; 
            } else if (command.equalsIgnoreCase("add")) {
                System.out.print("To add: ");
                String toAdd = scanner.nextLine(); 
                this.todoList.add(toAdd); 
            } else if (command.equalsIgnoreCase("list")) {
                this.todoList.print();
            } else if (command.equalsIgnoreCase("remove")) {
                System.out.print("Which one is removed? "); 
                int toRemoveIndex = Integer.valueOf(scanner.nextLine()); 
                this.todoList.remove(toRemoveIndex);
            } else {
                System.out.println("Unknown command. ");
            }
        }
    }
}
