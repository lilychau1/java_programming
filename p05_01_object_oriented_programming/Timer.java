package p05_01_object_oriented_programming;

public class Timer {
    private ClockHand seconds; 
    private ClockHand hundredthsOfASecond;

    public Timer() {
        this.seconds = new ClockHand(999999); 
        this.hundredthsOfASecond = new ClockHand(100); 
    }

    public void advance() {
        this.hundredthsOfASecond.advance();

        if (this.hundredthsOfASecond.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + "." + this.hundredthsOfASecond; 
    }
}

