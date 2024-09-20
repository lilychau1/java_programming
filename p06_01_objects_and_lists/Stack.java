package p06_01_objects_and_lists;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> strings; 

    public Stack() {
        this.strings = new ArrayList<>(); 
    }

    public boolean isEmpty() {
        return this.strings.isEmpty(); 
    }

    public void add(String value) {
        if (!(this.strings.contains(value))) {
            this.strings.add(value); 
        }
    }

    public ArrayList<String> values() {
        return this.strings; 
    }

    public String take() {
        int takeValueIndex = this.strings.size() - 1; 
        String takeValue = this.strings.get(takeValueIndex); 
        this.strings.remove(takeValueIndex); 
        return takeValue; 
    }
}
