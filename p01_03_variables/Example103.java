import java.util.Scanner;

public class Example103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Write an integer value ");
        int value_int = Integer.valueOf(scanner.nextLine()); 
        System.out.println("You wrote " + value_int);

        System.out.println("Write a double value ");
        double value_double = Double.valueOf(scanner.nextLine()); 
        System.out.println("You wrote " + value_double);

        System.out.println("Write a boolean value ");
        boolean value_bool = Boolean.valueOf(scanner.nextLine()); 
        System.out.println("You wrote " + value_bool);
    }

}
