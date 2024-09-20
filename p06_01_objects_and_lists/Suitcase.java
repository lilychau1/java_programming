package p06_01_objects_and_lists;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items; 
    private int totalWeight; 
    private int maxWeight; 

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>(); 
        this.maxWeight = maxWeight; 
        this.totalWeight = 0;
    }

    public void addItem(Item item) {
        if (this.totalWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item); 
            this.totalWeight += item.getWeight(); 
        }
    }

    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)"; 
        }
        
        String sString = ""; 
        if (this.items.size() != 1) {
            sString = "s"; 
        }  
        return this.items.size() + " item" + sString + " (" + this.totalWeight + " kg)"; 
    }

    public void printItems() {
        for (Item item:this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        return this.totalWeight; 
    }
}
