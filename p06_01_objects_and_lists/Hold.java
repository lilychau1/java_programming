package p06_01_objects_and_lists;

import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases; 
    private int maxWeight; 
    private int totalWeight; 

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>(); 
        this.maxWeight = maxWeight; 
        this.totalWeight = 0; 
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight + suitcase.totalWeight() <= maxWeight){
            this.suitcases.add(suitcase); 
            this.totalWeight += suitcase.totalWeight(); 
        }
    }

    public int totalWeight() {
        return this.totalWeight; 
    }
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight + " kg)"; 
    }

    public void printItems() {
        for (Suitcase suitcase:this.suitcases) {
            suitcase.printItems();
        }
    }

}
