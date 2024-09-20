package p06_01_objects_and_lists;

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts; 
    private int totalWeight; 

    public Package() {
        this.gifts = new ArrayList<>(); 
    }

    public void addGift(Gift gift) {
        this.gifts.add(gift); 
    }

    public int totalWeight() {
        int totalWeight = 0; 
        for (Gift gift:gifts) {
            totalWeight += gift.getWeight(); 
        }

        return totalWeight; 
    }
}
