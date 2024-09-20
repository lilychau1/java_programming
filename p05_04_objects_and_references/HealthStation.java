package p05_04_objects_and_references;

public class HealthStation {
    private int weighings = 0; 

    public int weigh(Person person) {
        this.weighings++; 
        return person.getWeight();
    }

    public void feed(Person person) {
        person.gainWeight();
    }

    public int weighings() {
        return this.weighings;
    }
}
