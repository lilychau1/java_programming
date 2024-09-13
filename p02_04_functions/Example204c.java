package p02_04_functions;

import java.util.Scanner;

public class Example204c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter first number: ");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter second number: ");
        int second = Integer.valueOf(scanner.nextLine()); 

        System.out.println("The sum of the numbers is: " + sum(first, second));
    }

    public static int sum(int first, int second) {
        return first + second; 
    }
    
}
