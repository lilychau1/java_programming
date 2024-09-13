package p01_02_reading;
import java.util.Scanner;

public class Example102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // We can now use the scanner tool
        // This tool is used to read input. 
        System.out.println("Write a message: ");

        String message1 = scanner.nextLine();
        String message2 = scanner.nextLine();
        
        System.out.println(message1);
        System.out.println(message2);
    }
}