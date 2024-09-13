package p03_02_array;

import java.util.Scanner;

public class Example302 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many elements in this array? ");
        int howMany = Integer.valueOf(reader.nextLine()); 
        
        int[] numbers = new int[howMany]; 

        System.out.println("Enter the numbers: ");

        int index = 0; 
        while (index < numbers.length) {
            numbers[index] = Integer.valueOf((reader.nextLine())); 
            index = index + 1;
        }

        System.out.println("Here are the numbers again: ");
        index = 0; 

        while (index < numbers.length) { 
            System.out.print(numbers[index] + ", ");
            index = index + 1;
        }
    }
}
