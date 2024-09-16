package p04_02_objects_in_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Example402 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); 
        ArrayList<Item> items = new ArrayList<>(); 

        while (true) {
            System.out.print("Name: ");
            String itemName = reader.nextLine();

            if (itemName.isEmpty()) {
                break;
            }
            
            items.add(new Item(itemName));
        }

        reader.close();
        
        for (Item item: items) {
            System.out.println(item);
        }
    }
}
