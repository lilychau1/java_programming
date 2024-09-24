package p06_02_user_interface;

import java.util.Scanner;

public class Example602c {
    public static void main(String[] args) {
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        UserInterface602c ui = new UserInterface602c(manager, scanner);
        ui.start();
    }
}
