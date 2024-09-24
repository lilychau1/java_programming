package p06_02_user_interface;

import java.util.Scanner;

public class Example602b {
    public static void main(String[] args) {
        TodoList todoList = new TodoList(); 
        Scanner scanner = new Scanner(System.in); 
        UserInterface602b ui = new UserInterface602b(todoList, scanner); 

        ui.start();
    }
}
