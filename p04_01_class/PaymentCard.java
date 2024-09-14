package p04_01_class;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably(){
        if (this.balance > 2.6) {
            this.balance -= 2.6;
        }
    }

    public void eatHeartily(){
        if (this.balance > 4.6) {
            this.balance -= 4.6;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0){
            if (this.balance + amount > 150) {
                this.balance = 150;
            } else {
                this.balance += amount;
            }
        }
            
    }
}
