package p05_02_method_overloading;

public class Counter {
    private int value; 

    public Counter(int startValue) {
        this.value = startValue; 
    }

    public Counter() {
        this(0); 
    }

    public int value() {
        return this.value; 
    }

    public void increase(int increaseBy) {
        this.value = this.value + increaseBy;
    }

    public void decrease(int decreaseBy) {
        this.value = this.value - decreaseBy;
    }

    public void increase() {
        this.increase(1); 
    }

    public void decrease() {
        this.decrease(1); 
    }

    public String toString() {
        return "Counter value: " + this.value; 
    }

}
