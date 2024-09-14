package p04_01_class;

import java.util.Scanner;

public class Example401e {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Scanner reader = new Scanner(System.in);
        int inputValue = 0;

        System.out.println("Enter numbers: ");

        while (true) {
            inputValue = Integer.valueOf(reader.nextLine());

            if (inputValue == -1) {
                break;
            }
            
            statistics.addNumber(inputValue);
        }

        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }
}
