package p04_01_class;

public class Example401 {
    public static void main(String[] args) {
        Debt mortgage = new Debt(120000.0, 0.01); 
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years ++;
        }

        mortgage.printBalance();
    }
}
