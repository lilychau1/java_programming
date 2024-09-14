package p04_01_class;

import java.util.Scanner;

public class Example401c {
    public static void main(String[] args) {
        Film chipmunks = new Film("Alvin and the Chipmunks: the Squakquel", 0);

        Scanner reader = new Scanner(System.in); 

        System.out.println("How old are you?");
        int age = Integer.valueOf(reader.nextLine());

        System.out.println();
        if (age >= chipmunks.ageRating()){
            System.out.println("You may watch the film " + chipmunks.name());
        } else {
            System.out.println("You may not watch the film " + chipmunks.name());
        }
    }
}
