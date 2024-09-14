package p04_01_class;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        this.count ++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum(){
        return this.sum;
    }

    public double average() {
        return Double.valueOf(this.sum) / Double.valueOf(this.count);
    }
}
