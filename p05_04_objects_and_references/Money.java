package p05_04_objects_and_references;

public class Money {
    private final int euros; // final keyword means immutable
    private final int cents; 

    public Money(int euros, int cents) {
        this.euros = euros; 
        this.cents = cents; 
    }

    public int euros() {
        return this.euros; 
    }

    public int cents() {
        return this.cents; 
    }

    public String toString() {
        String zero = ""; 
        if (this.cents < 10) {
            zero = "0"; 
        }

        return this.euros + "." + zero + this.cents + "e"; 
    }

    public Money plus(Money addition) {
        int newCents = this.cents + addition.cents; 
        int newEuros = this.euros + addition.euros; 

        if (newCents > 100) {
            newCents = newCents - 100; 
            newEuros++; 
        }

        Money newMoney = new Money(newEuros, newCents); 

        return newMoney;
    }

    public boolean lessThan(Money comparedMoney) {
        if (this.euros < comparedMoney.euros) {
            return true; 
        }

        if (this.euros > comparedMoney.euros) {
            return false; 
        }

        if (this.cents < comparedMoney.cents) {
            return true; 
        }

        return false;
    }

    public Money minus(Money decreaserMoney) {
        int newEuros = this.euros - decreaserMoney.euros;
        int newCents = this.cents - decreaserMoney.cents;

        if (newCents < 0) {
            newCents = newCents + 100;
            newEuros--;  
        }

        if (newEuros < 0) {
            newEuros = 0; 
            newCents = 0; 
        }

        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
}
