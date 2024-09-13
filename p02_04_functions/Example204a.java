package p02_04_functions;

import java.util.Scanner;

public class Example204a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("calling greet()");
        greet();
    }

    public static void greet() {
        System.out.println("Greetings!");
    }
}
