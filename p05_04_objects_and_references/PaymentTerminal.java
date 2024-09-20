package p05_04_objects_and_references;

public class PaymentTerminal {
    private double money; 
    private int affordableMeals; 
    private int heartyMeals; 
    private double affordableMealPrice; 
    private double heartyMealPrice; 

    public PaymentTerminal() {
        this.money = 1000; 
        this.affordableMealPrice = 2.5; 
        this.heartyMealPrice = 4.3; 
    }

    public double eatAffordably(double payment) {
        if (payment >= this.affordableMealPrice) {
            this.affordableMeals++; 
            this.money = this.money + this.affordableMealPrice; 
            return (payment - this.affordableMealPrice); 
        } else {
            return payment; 
        }
    }
    
    public double eatHeartily(double payment) {
        if (payment >= this.heartyMealPrice) {
            this.heartyMeals++; 
            this.money = this.money + this.heartyMealPrice; 
            return (payment - this.heartyMealPrice); 
        } else {
            return payment; 
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= this.affordableMealPrice) {
            this.affordableMeals++; 
            card.takeMoney(this.affordableMealPrice); 
            return true; 
        } else {
            return false; 
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= this.heartyMealPrice) {
            this.heartyMeals++;  
            card.takeMoney(this.heartyMealPrice); 
            return true; 
        } else {
            return false; 
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        this.money = this.money + sum; 
        card.addMoney(sum);
    }

    public String toString() {
        return "money: " + this.money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + this.heartyMeals; 
    }
}
