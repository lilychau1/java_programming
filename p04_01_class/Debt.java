package p04_01_class;

public class Debt {
    private double balance; 
    private double interestRate;

    public Debt(double initialBalance, double initialInterestRate) { //Constructor; name always same as the class
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }

    public void waitOneYear() {
        this.balance = this.balance * (1 + this.interestRate);
    }
}