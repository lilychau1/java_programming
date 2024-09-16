package p04_02_objects_in_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Example402b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<PersonalInformation> personalInformationCollection = new ArrayList<>();

        while (true) {
            System.out.print("First Name: ");
            String firstName = reader.nextLine();
            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("Last Name: ");
            String lastName = reader.nextLine();

            System.out.print("Identification Number: ");
            int identificationNumber = Integer.valueOf(reader.nextLine());

            personalInformationCollection.add(new PersonalInformation(firstName, lastName, identificationNumber)); 
        }

        reader.close();
        
        System.out.println("");
        for (PersonalInformation personalInformation:personalInformationCollection) {
            System.out.println(personalInformation);
        }
    }
}
