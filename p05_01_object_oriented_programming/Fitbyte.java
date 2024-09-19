package p05_01_object_oriented_programming;

public class Fitbyte {
    private int age; 
    private int restingHeartRate; 

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age; 
        this.restingHeartRate = restingHeartRate; 
    }

    public double maximumHeartRate() {
        return 206.3 - (0.711 * Double.valueOf(this.age)); 
    }
    
    public double targetHeartRate(double percentageOfaximum) {
        return (this.maximumHeartRate() - this.restingHeartRate) * percentageOfaximum + this.restingHeartRate; 
    }
}
